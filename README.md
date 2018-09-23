# soapcookbook

generate xsd from xml
java -jar ~/Downloads/trang-20030619/trang.jar Catalog2.xml Catalog.xsd

generate POJO from xsd
xjc src/main/resources/book_russiandoll.xsd -d src -p com.poc.soa