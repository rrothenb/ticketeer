package ticketeer



class TicketeerReservationsWebTests extends grails.util.WebTest {

    // Unlike unit tests, functional tests are sometimes sequence dependent.
    // Methods starting with 'test' will be run automatically in alphabetical order.
    // If you require a specific sequence, prefix the method name (following 'test') with a sequence
    // e.g. test001XclassNameXListNewDelete

   void testSomething() {
invoke "http://localhost:8080/Ticketeer/auth/login"
setInputField(name: "username", value: "rrothenb@yahoo.com")
setInputField(name: "password", value: "bovine")
setCheckbox(name: "rememberMe")
setCheckbox(htmlId: "rememberMe")
setCheckbox(forLabel: "Remember me?:")
clickButton "Sign in"
clickButton(name: "", "Sign in")
clickButton "Create"
clickButton(name: "", "Create")
clickButton "Add Seats"
clickButton(name: "seats_add", "Add Seats")
clickButton htmlId: "seats_add"
clickButton name: "seats_add"
setInputField(name: "seats_0_quantity", value: "123")
setInputField(htmlId: "seats_0_quantity", value: "123")
setSelectField(name: "seats_0_price.id", text: "Full (\$22.00)")
setSelectField(htmlId: "seats_0_price.id", text: "Full (\$22.00)")
clickButton "Create"
clickButton(name: "", "Create")
setInputField(name: "customer", value: "jes")
setInputField(htmlId: "customer", value: "jes")
setInputField(forLabel: "Customer:", value: "jes")
clickLink "Cleese, Jessa"
setInputField(name: "seats_0_quantity", value: "2")
setInputField(htmlId: "seats_0_quantity", value: "2")
setSelectField(name: "seats_0_price.id", text: "Special (\$10.00)")
setSelectField(htmlId: "seats_0_price.id", text: "Special (\$10.00)")
clickButton "Create"
clickButton(name: "", "Create")
clickLink "Rothenberg, Alex"
clickLink " "
clickLink " "
clickLink " "
clickLink "Prices"
clickLink "Group"
clickLink "Customers"
clickLink "Rothenberg"
clickLink " "
clickLink "Shows"
clickLink "Carbuncle"
clickLink "Prices"
clickLink "Customers"
clickLink "Cleese"
clickLink " "
clickLink "Theater"
setSelectField(name: "defaultPrice.id", text: "Special (\$10.00)")
setSelectField(htmlId: "defaultPrice.id", text: "Special (\$10.00)")
clickLink "Reservations"
clickButton "New Reservation "
clickButton "Add Seats"
clickButton(name: "seats_add", "Add Seats")
clickButton htmlId: "seats_add"
clickButton name: "seats_add"
setInputField(name: "seats_0_quantity", value: "hmm")
setInputField(htmlId: "seats_0_quantity", value: "hmm")
clickButton "Create"
clickButton(name: "", "Create")
setInputField(name: "seats_0_quantity", value: "2")
setInputField(htmlId: "seats_0_quantity", value: "2")
setInputField(name: "customer", value: "je")
setInputField(htmlId: "customer", value: "je")
setInputField(forLabel: "Customer:", value: "je")
clickLink "Rothenberg, Jessa"
clickButton "Create"
clickButton(name: "", "Create")
setInputField(name: "filter", value: "rick")
setInputField(htmlId: "filter", value: "rick")
clickButton "Filter"
setInputField(name: "filter", value: "jessa")
setInputField(htmlId: "filter", value: "jessa")
clickButton "Filter"
clickButton "Reset"
setSelectField(name: "max", text: "20")
clickLink "Next"
clickLink "Customer"
clickLink "Customer"
setSelectField(name: "max", text: "50")
clickLink "Customer"
clickLink "Customer"
clickLink "Cost"
clickLink "Cost"
clickLink "Performance"    }

}