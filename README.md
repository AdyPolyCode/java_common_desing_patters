# java_common_desing_patters

### Creational
Creational design patterns are concerned with object creation mechanisms. They provide different ways to instantiate objects, aiming to improve flexibility, maintainability, and control over object creation
- Builder: Aims to make object creation less complex, usually used when constructor parameters are getting too long.
- Singleton: Aims to make object creation durable as only one instance is available using this pattern.
- Prototype: Aims to make object creation memory efficient when creating one could be time consuming, it ensures object creation of same instance is more convenient with the help of cloning.
- Factory: Aims to decouple the creation to concrete classes, only knows about some parameters and from which specific objects are being created.

### Structural
Structural design patterns focus on how classes and objects are composed to form larger structures. The benefit is to organize and manipulate these structures in a flexible and efficient way.
- Adapter: Enables compatibility between classes with incompatible interfaces by introducing an adapter class that acts as a translator.
- Bridge:  Decouples an abstraction from its implementation, and allows you to change both the abstraction and the implementation independently without affecting each other.
- Composite: Treats a hierarchy of objects like a single object, same operations can be applied to individual objects or the entire hierarchy.
