PROJECT TITLE: Library System
PURPOSE OF PROJECT: Creating a Library System
VERSION or DATE: 30th November 2023
HOW TO START THIS PROJECT: Creating objects
AUTHOR: Deepak
USER INSTRUCTIONS:
The Library System indicated in this project include classes such as:
•	Library
•	PhysicalBook
•	Author
•	ElectronicResource
•	LibraryMember
•	Guest

Here, the Library class acts as a superclass or a parent class, where the PhysicalBook, ElectronicResource, 
LibraryMember and Guest class acts as a subclass or a child class. The inheritance concept is required to establish 
a relationship between different resources of the library, which includes PhysicalBook and ElectronicResource. This 
concept helps in creating a unified catalogue which in turn benefits us in maintaining different resources of the 
library in a consistent manner.

As the  library class is a  superclass, it can collect various types of resources from various classes. By which we can 
access and maintain resources in the collection of resources or we can say that we can handle the resources in this 
catalog in an effective and efficient way. The class PhysicalBook and ElectronicResource being a subclass have their own 
unique specific features and working as their class indicates. 

The subclass LibraryMember represents library members of the Library who are allowed to borrow books and access the 
electronic resources. The class LibraryMember inherits from the supercass Library which allows members to access different 
types of resources.

As stated, the class Guest also acts as a subclass of the class Library(superclass). This class presents guest of the 
library who have limitations such as able to access the library for maximum of 3 days and are not allowed to borrow books 
but can access the electronic resources.

To conclude, we can say that inheritance gives a better opportunity to make our work more flexible. It also allow the user 
to reuse the code as we can make changes to the functions in the superclass from where the subclasses inherits. 
