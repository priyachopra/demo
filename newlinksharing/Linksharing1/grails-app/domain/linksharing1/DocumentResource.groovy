package linksharing1

class DocumentResource extends Resource{
String filepath

    static constraints = {

	filepath (blank: false, nullable: false)
    }
}
