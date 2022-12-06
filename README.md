
# Movie Virtual Assistant 
## Main Project Description:

A virtual assistant that allows for customers to book/change/cancel new or current movie ticket bookings. After confirming their booking, the customer gets their ticket sent to them via email. The entire project was developed using Java and utilized libraries such as JDBC, JSwing, Java AWT, and Java Mail for our features. We went with a simple, straight-forward design for our assistant's user interface. The user has two input options, either by directly typing into the chatbox or by clicking one of the buttons right above it. After the user has finished their interaction and their request was met, they receive a confirmation email of the interaction via the email on file.

## Individual Project Added Description

First, I added a text-to-speech accessibility feature. A button is shown at the top right corner of the chatbot as soon as it starts. The user can choose to click it at any time. Once clicked, the chatbot will start speaking first by introducing itself and then by readin any dialogue outputted from itself outloud. I used the FreeTTS API to make this possible. Secondly, I added more pattern matching options but this time I used the java.net.uri library to allow the chatbot to open webpages. I've added an option for the user to ask for reviews on a movie and get redirected to a YouTube search for that. I've also added a webpage pop-up for a "contact us" that redirects the user to cineplex's contact us page as an example. Lastly, I took this a step further and allowed the user to google anything they'd like through the chatbot and it would redirect them to the google results page for that exact query.

## Old Features: 
### Amending an Existing Movie Ticket 
Users can now finally edit their existing tickets. There are several ways to access this feature. User can either type in that they would like to edit/amend their ticket or click the relevant button at the beginning of the interaction. Once the process has started the user can amend any detail relating to the ticket. However, the customer details cannot be amended once saved on the database. This improves our system by being more forgiving with mistakes and providing the user with an option to edit their tickets in case they cannot make it to the current booked movie time.

![amending](/outputs/amend_booking.png) 
### Cancelling an Existing Movie Ticket
Users can cancel an existing ticket if they choose to. By canceling a ticket, the seat selected by the user becomes unoccupied. Canceling a ticket can be done through clicking the "Cancel Booking" button as soon as the program starts or by typing it into the chatbox. By allowing users to delete their tickets, we're including a fundamental feature that needs to be implemented. In our previous version of the assistant, all bookings were final and non-editable. 


![canceling](/outputs/delete_booking.png) 
### New Account Creation
Users can now create an account which wil be stored in the database. The virtual assistant will ask for the user for their email and check if it already exists in the database and if not the user is asked their name, gender and birthdate to create a new account. 


![database](/outputs/new_dude.png) 
### Email Confirmation
After confirming their ticket booking, users are sent an email including a full summary of their order and a link for payment. Another case is when the user ammends their ticket, they are sent a new ticket summary with the new information. Upon deleting a ticket, users are sent an email confirming the cancellation of their booking and a refund request link. By sending users an email of their order, we provide them with the option of keeping a permanent record of their reservations outside our database.

![email](/outputs/email.png)
### Stand-alone Database Storage
We used MySQL, JDBC library and Docker to create a database to store customer, movie and seat information as well as using foreign keys to reference other tables in the database to create a more concise and complete way of storing information. In our previous version, we used ArrayLists for data storage which proved to be difficult as we had no option for reliable offline data storage or support for multi-users.

![database](/outputs/database.png)
### Pattern Matching
We used pattern matching to give more leeway for users when inputting their request for the virtual assistant. Using string arrays of acceptable answers and different variations of the same request, we were able to compare the chatbox input with the elements of the array and set our variable values accordingly. Using pattern matching is a huge improvement from our previous version which hard-coded if-else statements and switch statements

![pattern_matching](/outputs/pattern_matching.png)

## New Features & APIs

### Text-To-Speech
Using FreeTTS API, I was able to incorporate a Text-To-Speech option for users. As mentioned in the project description, there is now a new button for that feature. At anytime, the user can click this button and hear a greeting audio from Sally, who then begins to read out every request written on the chat area by the system.

### Google Search
Using the java.net.URI library, I've added the option for users to search for something on google simply by typing "google" followed by their query. The result will be in the form of a pop-up window opening in their default browser that shows a google results page for their question.
