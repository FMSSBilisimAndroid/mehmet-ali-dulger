# Namespace


XML (Extensible Markup Language- Genişleyebilir İşaretleme Dili) bir etiketleme dilidir ve etiket isimleri programcı tarafından belirlenir. Farklı XML uygulamalarından birlikte kullanılan XML kaynakları aynı isimde etiketlere sahip olabilir. Bu çakışmayı önlemek için namespace (isim uzayı) ve prefix (ön ek) kullanılır. Namespace tanımlarken URI (Uniform Resource Identifier) namespace ismi olarak verilir. En yaygın kullanılanı URL (Uniform Resource Locator), diğeri ise URN (Uniform Resource Name) dir. URL ve URN'nin namespace olarak kullanım amacı namespacelerin tek olmasını sağlamaktır ve hangisinin kullanılacağı programcının tercihine bırakılmıştır. URL namespace olarak kullanıldığında karışıklığa sebep olabilir; ancak namespace isimleri sadece tanıtıcı etiketlerdir ve anlamlı adres işaret etmek zorunda değildirler. 

 ``` 
<h:html xmlns:gdc="http://www.itu.edu.tr/graduates"
xmlns:h="http://www.w3.org/HTML/1998/html4">
     <h:head>
          <h:title>ITU Graduates</h:title>
     </h:head>
     <h:body>
          <gdc:graduate>
               <gdc:title>2011 Graduates</gdc:title>
           <h:table>
               <h:tr>
                    <h:td>Name</h:td>
                    <h:td>Surname</h:td>
                    <h:td>Department</h:td>
               </h:tr>
               <h:tr>
                    <h:td><gdc:name>Name1</gdc:name></h:td>
                    <h:td><gdc:surname>Surname1</gdc:surname></h:td>
                    <h:td><gdc:department>mathematics engineering</gdc:department></h:td>
               </h:tr>
           </h:table>
          </gdc:graduate>
     </h:body>
</h:html>
 ``` 
