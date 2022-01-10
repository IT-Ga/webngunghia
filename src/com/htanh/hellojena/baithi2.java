package com.htanh.hellojena;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.VCARD;

public class baithi2 {
	static Model creaModel() {
		// some definitions
				String personURI = "http://www.w3.org/Giangvien/DangVanTien";
				String lamViecTaiIRI ="http://semanticweb-lear/lamViecTai";
				String KhoaIRI1 = "http://ww.w3.org/DHKH/Khoa/CNPM";
				String KhoaIRI2 = "http://ww.w3.org/DHKH/Khoa/ANM";
				String subjectIRI = "http://ww.w3.org/TruongDH";
				String SchoolIRI = "http://ww.w3.org/DHKH";
				String givenName = "Dang Van";
				String familyName = "Tien";
				String emailName = "18t1021002@husc.edu.vn";
				String fullName = givenName + " " + familyName;
				
				
				//Sinh viên môn Web ngữ nghĩa
				String MonURIWEBNGUNGHIA = "http://www.w3.org/Mon/WebNguNghia";
				String GroupURIWebNGUNGHIA = "http://www.w3.org/Mon/WebNguNghia-Nhom1";
				String personWEBNGUNGHIAIRI1 = "http://ww.w3.org/LeNguyenTri";
				String givenName1 = "Le Nguyen";
				String familyName1 = "Tri";
				String Completion1 = "14%";
				String emailName1 = "lnTri1@w3.org";
				String fullName1 = givenName1 + " " + familyName1;
				
				
				String personWEBNGUNGHIAIRI4 = "http://ww.w3.org/TranVanHaiDuong";
				String givenName4 = "Tran Van Hai";
				String familyName4 = "Duong";
				String Completion4 = "30%";
				String emailName4 = "tvhd@w3.org";
				String fullName4 = givenName4 + " " + familyName4;
				
				// nhóm 2
				String GroupURIWebNGUNGHIA2 = "http://www.w3.org/Mon/WebNguNghia-Nhom2";
				String personWEBNGUNGHIAIRI2 = "http://ww.w3.org/HuynhTienAnh";
				String givenName2 = "Huynh Tien";
				String familyName2 = "Anh";
				String Completion2 = "50%";
				String emailName2 = "htanh@w3.org";
				String fullName2 = givenName2 + " " + familyName2;
				
				//Sinh viên môn JavaNC
				String MonURIJAVANC= "http://www.w3.org/Mon/JAVANC";
				String GroupURIJAVANC = "http://www.w3.org/Mon/JAVANC-Nhom1";
				String personJAVANC1 = "http://ww.w3.org/NGUYENKIMNGAN";
				String givenName3 = "Nguyen Kim";
				String familyName3 = "Ngan";
				String Completion3 = "33%";
				String emailName3= "nkn@w3.org";
				String fullName3 = givenName3 + " " + familyName3;
				
				//Sinh viên môn Thiết Kế Mạng
				String MonURITKMANG= "http://www.w3.org/Mon/THIETKEMANG";
				String GroupURITKMANG = "http://www.w3.org/Mon/THIETKEMANG-Nhom1";
				String personTKMANG = "http://ww.w3.org/NguyenDinhNgoc";
				String givenName5 = "Nguyen Dinh";
				String familyName5 = "Ngoc";
				String Completion5 = "45%";
				String emailName5= "nguyendinhngoc@w3.org";
				String fullName5 = givenName5 + " " + familyName5;
				
				// create an empty Model
				Model model1 = ModelFactory.createDefaultModel();

				// create the resource
				// and add the properties cascading style
				Resource lmc = model1.createResource(SchoolIRI);
				Property lamViectai=model1.createProperty(lamViecTaiIRI);
			    Resource laGiangvien = model1.createResource(KhoaIRI1);
				Property subject=model1.createProperty(subjectIRI);
				model1.createResource(KhoaIRI1)
				
				.addProperty(subject, model1.createResource(MonURIWEBNGUNGHIA)
				
						.addProperty(VCARD.CLASS, model1.createResource(GroupURIWebNGUNGHIA)
								.addProperty(VCARD.FN,model1.createResource(personWEBNGUNGHIAIRI1)
										.addProperty(VCARD.NAME, (fullName1))
										.addProperty(VCARD.LABEL, (Completion1))
										.addProperty(VCARD.EMAIL, (emailName1))
										)
								.addProperty(VCARD.FN,model1.createResource(personWEBNGUNGHIAIRI4)
										.addProperty(VCARD.NAME, (fullName4))
										.addProperty(VCARD.LABEL, (Completion4))
										.addProperty(VCARD.EMAIL, (emailName4))	
								))
						.addProperty(VCARD.CLASS, model1.createResource(GroupURIWebNGUNGHIA2)
								.addProperty(VCARD.FN,model1.createResource(personWEBNGUNGHIAIRI2)
										.addProperty(VCARD.NAME, (fullName2))
										.addProperty(VCARD.LABEL, (Completion2))
										.addProperty(VCARD.EMAIL, (emailName2))
								)))
				
						
						//Mon JavaNC
					.addProperty(subject, model1.createResource(MonURIJAVANC)
								.addProperty(VCARD.CLASS, model1.createResource(GroupURIJAVANC)
										.addProperty(VCARD.FN,model1.createResource(personJAVANC1)
												.addProperty(VCARD.NAME, (fullName3))
												.addProperty(VCARD.LABEL, (Completion3))
												.addProperty(VCARD.EMAIL, (emailName3))
										))
						
						);
				       // AN NINH MẠNG
				       // THIET KE MANG
					model1.createResource(KhoaIRI2)
					.addProperty(subject, model1.createResource(MonURITKMANG)
							
							.addProperty(VCARD.CLASS, model1.createResource(GroupURITKMANG)
									.addProperty(VCARD.FN,model1.createResource(personTKMANG)
											.addProperty(VCARD.NAME, (fullName5))
											.addProperty(VCARD.LABEL, (Completion5))
											.addProperty(VCARD.EMAIL, (emailName5))
											)));
					
							
				lmc.addProperty(lamViectai, laGiangvien);
				lmc.addProperty(VCARD.ADR, (personURI));
				lmc.addProperty(VCARD.NAME, (fullName));
				lmc.addProperty( VCARD.EMAIL,(emailName));
				lmc.addProperty(DC.type, FOAF.Person);
				lmc.addProperty(FOAF.based_near,model1.createResource(KhoaIRI1));
				
				
				return model1 ;
	}
	
	
	
	static void createAndPrintModel() {
		Model model1 =creaModel();
	
		// In nội dung của model dưới dạng mặc định (XML-RDF)
		model1.write(System.out);
		
	}
	
	public static void main(String[] args) {
		createAndPrintModel();
	}
}
