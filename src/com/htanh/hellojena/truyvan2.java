package com.htanh.hellojena;

import org.apache.jena.iri.impl.Main;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.RDF;

public class truyvan2 {
	// truy xuất theo ADR
	/*  public static void main(String[] args) {
	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	Model model=FileManager.get().loadModel("D:\\dulieu.rdf");
	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE  {"			
			+ "?FN vcard:ADR ?z." //truy vấn địa chỉ
			
			+ " } ";
	Query query=QueryFactory.create(queryString);
	QueryExecution qexec= QueryExecutionFactory.create(query, model);
	try {
		ResultSet results=qexec.execSelect();
		while (results.hasNext()) {
		QuerySolution soln=results.nextSolution();   
		    Literal name3=soln.getLiteral("z");
		  
			
			System.out.println("ADR: "+name3);
			
		}
	} finally {
		qexec.close();
	}
}  
	*/
	// truy xuat theo tên
 /* public static void main(String[] args) {
	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	Model model=FileManager.get().loadModel("D:\\dulieu.rdf");
	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE  {"
			+ "?FN vcard:NAME ?x." 
			//+ "?FN vcard:EMAIL ?y." 
			+ " } ";
	Query query=QueryFactory.create(queryString);
	QueryExecution qexec= QueryExecutionFactory.create(query, model);
	try {
		ResultSet results=qexec.execSelect();
		while (results.hasNext()) {
			QuerySolution soln=results.nextSolution();
			Literal name=soln.getLiteral("x");
			Literal name1=soln.getLiteral("y");
			System.out.println("Họ và tên: "+name);
			//System.out.println("Email"+name1);
		}
	} finally {
		qexec.close();
	}
}
 */
 // truy xuất theo họ và tên + email
 /*public static void main(String[] args) {
	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	Model model=FileManager.get().loadModel("D:\\dulieu.rdf");
	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE  {"
		+ "?FN vcard:NAME ?x." 
		+ "?FN vcard:EMAIL ?y." 
			+ " } ";
	Query query=QueryFactory.create(queryString);
	QueryExecution qexec= QueryExecutionFactory.create(query, model);
	try {
		ResultSet results=qexec.execSelect();
		while (results.hasNext()) {
		QuerySolution soln=results.nextSolution();
		Literal name=soln.getLiteral("x");
			Literal name1=soln.getLiteral("y");
			System.out.println("Họ và tên: "+name);
			System.out.println("Email: "+name1);
	}
	} finally {
		qexec.close();
	}
} 
 */
 // truy xuất họ tên và ADR
	
/* public static void main(String[] args) {
	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	Model model=FileManager.get().loadModel("D://dulieu.rdf");
	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
		+ " SELECT * WHERE  {"
			+ "?coutry vcard:NAME ?x." 
			+ "?coutry vcard:ADR ?y." 
			+ " } ";
	Query query=QueryFactory.create(queryString);
	QueryExecution qexec= QueryExecutionFactory.create(query, model);
	try {
		ResultSet results=qexec.execSelect();
		while (results.hasNext()) {
		QuerySolution soln=results.nextSolution();
			Literal name=soln.getLiteral("x");
			Literal name1=soln.getLiteral("y");
			System.out.println("Họ và tên:"+name);
			System.out.println("ADR: "+name1);
		}
	} finally {
		qexec.close();
	}
}
*/
	// truy xuất tiến trình
	/*public static void main(String[] args) {
		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		Model model=FileManager.get().loadModel("D://dulieu.rdf");
		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE  {"
				+ "?coutry vcard:NAME ?x." 
				+ "?coutry vcard:EMAIL ?y." 
				+ "?coutry vcard:LABEL ?z." 
				+ " } ";
		Query query=QueryFactory.create(queryString);
		QueryExecution qexec= QueryExecutionFactory.create(query, model);
		try {
			ResultSet results=qexec.execSelect();
			while (results.hasNext()) {
			QuerySolution soln=results.nextSolution();
				Literal name=soln.getLiteral("x");
				Literal name1=soln.getLiteral("z");
				System.out.println("Họ và tên:"+name);
				System.out.println("Quá TRình: "+name1);
			}
		} finally {
			qexec.close();
		}
	}	
	*/

	
	// Tìm tên, địa chỉ theo tên thành viên
	/*public static void main(String[] args) {
		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		Model model=FileManager.get().loadModel("D://dulieu.rdf");
		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
				+ "PREFIX j.0:<http://semanticweb-lear/>"
				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
				+ " SELECT * WHERE  {"
				+ "?FN vcard:NAME ?x."
				+ "?FN vcard:EMAIL ?y."
				+ "?FN vcard:LABEL ?z. "
				+ "FILTER(?x =\"Huynh Tien Anh\")" 
				+ " } ";
		Query query=QueryFactory.create(queryString);
		QueryExecution qexec= QueryExecutionFactory.create(query, model);
		try {
			ResultSet results=qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution soln=results.nextSolution();
				Literal name=soln.getLiteral("x");
				Literal name1=soln.getLiteral("y");
				Literal name2=soln.getLiteral("z");
				System.out.println("Tên thành viên: "+name);
				System.out.println("Email: "+name1);
				System.out.println("QUÁ TRÌNH: "+name2);
				System.out.println("-------------------------------");
			}		} finally {
			qexec.close();
		}
	}
 */
	
	  	public static void main(String[] args) {
		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		Model model=FileManager.get().loadModel("D://dulieu.rdf");
		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
				+ "PREFIX j.0:<http://semanticweb-lear/>"
				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
				+ " SELECT * WHERE  {"
				+ "?FN vcard:NAME ?x."
				+ "?FN vcard:EMAIL ?y."
				+ "?FN vcard:LABEL ?z. "
				+ "FILTER(?y =\"lnTri1@w3.org\")" 
				+ " } ";
		Query query=QueryFactory.create(queryString);
		QueryExecution qexec= QueryExecutionFactory.create(query, model);
		try {
			ResultSet results=qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution soln=results.nextSolution();
				Literal name=soln.getLiteral("x");
				Literal name1=soln.getLiteral("y");
				Literal name2=soln.getLiteral("z");
				System.out.println("Tên thành viên: "+name);
				System.out.println("Email: "+name1);
				System.out.println("QUÁ TRÌNH: "+name2);
				System.out.println("-------------------------------");
			}		} finally {
			qexec.close();
		}
	}


} 