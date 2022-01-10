package com.htanh.hellojena;



import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.VCARD;

public class test {
	static Model creaModel() {
		//1. Tạo một model
		Model model=ModelFactory.createDefaultModel();

		//2. Tạo ra resource trong model
		String nknIRI="http://nguyen.kim.ngan/foaf.rdf#";
		Resource nguyenkimngan=model.createResource(nknIRI);
		
		String lamViecTaiIRI="http://semanticweb-lear/lamViecTai";
		Property lamViecTai=model.createProperty(lamViecTaiIRI);
		Resource truongDHKH=model.createResource("http://semanticweb-lear/dhkh");
		
		String subjectIRI="http://semanticweb-lear/coutry";
		Property subject=model.createProperty(subjectIRI);
		
		nguyenkimngan.addProperty(subject,model.createResource( "http://dbpedia.org/resource/DaLat").
				addProperty(VCARD.FN, model.createResource("http://dbpedia.org/resource/ThacDatanla").
						addProperty(VCARD.NAME, "Thác Datanla").
						addProperty(RDF.predicate, "2000000VNĐ").
						addProperty(VCARD.ADR, "QL20 Đèo Prenn, Phường 3, Thành phố Đà Lạt, Lâm Đồng 66000")).
				        
				addProperty(VCARD.FN, model.createResource("http://dbpedia.org/resource/VuonThuZooDooDaLat").
						addProperty(VCARD.NAME, "Vườn Thú ZooDoo").
						addProperty(RDF.predicate, "3000000VNĐ").
						addProperty(VCARD.ADR, "tiểu khu 94 A – Xã Đa Nhim – Huyện Lạc Dương – Tỉnh Lâm Đồng"))
				
						);
		//3. Bổ sung statement cho resource
		
		
		nguyenkimngan.addProperty(lamViecTai, truongDHKH);
		nguyenkimngan.addProperty( VCARD.EMAIL,"nganpt054@gmail.com");
		nguyenkimngan.addProperty(DC.type, FOAF.Person);
		nguyenkimngan.addProperty(FOAF.based_near,model.createResource("http://dbpedia.org/resource/DaLat"));
		return model;
	}

	static void createAndPrintModel() {
		Model model =creaModel();
		// In nội dung của model dưới dạng mặc định (XML-RDF)
		model.write(System.out);
	}
	public static void main(String[] args) {
		// ví dụ 1
		createAndPrintModel();
		
	}
}
