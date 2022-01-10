package com.htanh.hellojena;

import java.io.InputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.VCARD;

public class huynhtienanh_18t1021002 {
	
	static String nameSpace = "http://purl.org/dc/elements/1.0/";
	static String personURI = "http://www.w3.org/Home/Lassila";
	static String fullName = "Ora Lassila";

	public static void main(String[] args) {
        sample1();
		sample2();
        sample3();
		
	}

	static void sample1() {
		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		Resource lassila = model.createResource(personURI);

		// add the property
		lassila.addProperty(VCARD.NAME, fullName);

		model.write(System.out);
	}

	static void sample2() {
		// some definitions
		String personURI = "http://www.w3.org/Home/Lassila";
		String givenName = "Ora";
		String familyName = "Lassila";
		String emailName = "lassila@w3.org";
		String fullName = givenName + " " + familyName;

		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		// and add the properties cascading style
		Resource lassila = model.createResource(personURI).addProperty(VCARD.N,
				model.createResource().addProperty(VCARD.EMAIL, emailName).addProperty(VCARD.NAME, fullName));

		model.write(System.out);
	}
	static void sample3() {
		// some definitions
		String personURI = "http://www.w3.org/Home/Lassila";
		String lassilaIRI = "http://ww.w3.org/staffid/85740";
		String givenName = "Ora";
		String familyName = "Lassila";
		String emailName = "lassila@w3.org";
		String fullName = givenName + " " + familyName;

		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		// and add the properties cascading style
		Resource lassila = model.createResource(personURI).addProperty(VCARD.N,
				model.createResource(lassilaIRI).addProperty(VCARD.EMAIL, emailName).addProperty(VCARD.NAME, fullName));

		model.write(System.out);
	}
	

	static Model createModel() {
//		String personURI = "http://somewhere/JohnSmith";
//		String givenName = "John";
//		String familyName = "Smith";
//		String fullName = givenName + " " + familyName;
//
//		// create an empty Model
//		Model model = ModelFactory.createDefaultModel();
//
//		// create the resource
//		// and add the properties cascading style
//		Resource johnSmith = model.createResource(personURI).addProperty(VCARD.FN, fullName).addProperty(VCARD.N,
//				model.createResource().addProperty(VCARD.Given, givenName).addProperty(VCARD.Family, familyName));
//		return model;

		// some definitions
		String personURI = "http://www.w3.org/Home/Lassila";
		String givenName = "Lassila";
		String familyName = "Ora";
		String emailName = "lassila@w3.org";
		String fullName = givenName + " " + familyName;
		// create an empty model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		// and add the properties cascading style
		Resource lassila = model.createResource(personURI).addProperty(VCARD.NAME, fullName).addProperty(VCARD.N,
				model.createResource().addProperty(VCARD.EMAIL, emailName));
		return model;
	}


	

	

	
} 