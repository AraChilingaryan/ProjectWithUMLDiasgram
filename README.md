# ProjectWithUMLDiagram
![FirstUml](https://user-images.githubusercontent.com/67354446/90335216-4b794e00-dfe4-11ea-8640-54c06e6b9f06.png)

## Layers
in my project i have 2 layers com.beyond.person.core and com.beyond.person.entrypoint 
## EntryPoint
the entrypoint package has a single Main class with main method,where we only have to choose what kind of person we want to create
if it correct input you will input arguments for person(name, lastName etc..) or if it wrong choice program will give you chance
and also will let you know  if you inputed wrong argument
## Core
in core layer i have a lot of different packages lets see
## core.model
here we have 4 models or persons where the base is BasePerson(parent class) and also singer, programmer, dancer(child classes)
they all have common fields and methods and also specific methods 
## core.ervice
in this pachage i have 4 interfaces, where evryone is contains methods for our models
and  BasePersonActionService is parent and DancerActionService, ProgrammerActionService, SingerActionService are sub-classes
## core.service.impl
in this package i have BasePersonActionServiceImpl, DancerActionServiceImpl, ProgrammerActionServiceImpl, SingerActionServiceImpl
they implement the interfaces DancerActionService, ProgrammerActionService, SingerActionService
## core.service.personFactory
this package has a single PersonFactory class which has a getPersonType(BasePerson person) method, and this method returns one of 
.impl package's class depond on getPersonType's argument
## core.service.exceptions
this package has a lot of exceptions, they all RunTimeExceptions and also all they extends from BaseException
and also we have ValidationException through this we throw our exceptions
## core.service.enumaration
this package have States for our Person types, SIngerType, DancerType, ProgrammerType, also have Gender enum(male, female)
and States enum
## core.service.helper
this package have 3 classes AssistingMethods which hase 3 helping methods, also UserInputArguments which do all work depend on our choice
we only pass him our choice, name lastname designation and it returns our personsc methods SetInputArguments this check if our inputed arguments 
for person correct  or no

