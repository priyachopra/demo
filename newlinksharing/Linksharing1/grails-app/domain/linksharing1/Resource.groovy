package linksharing1

class Resource {
String description
Date datecreated
Date lastupdated
static belongs=[topic: Topic]
static hasMany=[readingitem: ReadingItem, resourcerating: ResourceRating]

    static constraints = {

description (size:1..1024) // assuming description is summary
    }
}
