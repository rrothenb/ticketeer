grails.config.locations = [ "file:Ticketeer-config.groovy" ]

max.entries = 20

grails.validation.ConstrainedProperty.registerNewConstraint("futureOnly", FutureOnlyConstraint.class)
grails.validation.ConstrainedProperty.registerNewConstraint("secondary", SecondaryConstraint.class)
grails.validation.ConstrainedProperty.registerNewConstraint("description", DescriptionConstraint.class)

