class TeaBags:

	teaBagList = None # instance of []
	parent = None  # instance of TeaBags
	name = None

	def constructor (self) :
		raise Exception("Can't instantiate abstract class, TeaBags")

	def countTeaBags (self) :
		raise Exception("Unimplemented method TeaBags.countTeaBags")

	def add (self) :
		raise Exception("Unimplemented method TeaBags.add")

	def remove (self) :
		raise Exception("Unimplemented method TeaBags.remove")

	def createListIterator (self) :
		raise Exception("Unimplemented method TeaBags.createListIterator")

	def setName(self,nameIn) :
		self.name = nameIn

	def getName(self) : 
		return self.name

	def setParent(self,parentIn) :
		self.parent = parentIn

	def getParent(self) : 
		return self.parent
