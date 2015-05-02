package linksharing1

class Resource {
String description
Date datecreated
Date lastupdated
static belongs=[user: User]


    static constraints = {
description (size:0..1024) // assuming description is summary
    }
}
