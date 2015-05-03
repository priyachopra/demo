package linksharing1

class LinkResource extends Resource{
String url
	

    static constraints = {
    
	url(url:true, blank: false, nullable: false)
}
}
