// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/Crime_backend/conf/routes
// @DATE:Thu Feb 07 15:41:27 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  UsersController_1: controllers.UsersController,
  // @LINE:12
  BooksController_3: controllers.BooksController,
  // @LINE:19
  HelloWorldController_5: controllers.HelloWorldController,
  // @LINE:27
  HomeController_2: controllers.HomeController,
  // @LINE:29
  CountController_0: controllers.CountController,
  // @LINE:31
  AsyncController_4: controllers.AsyncController,
  // @LINE:34
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    UsersController_1: controllers.UsersController,
    // @LINE:12
    BooksController_3: controllers.BooksController,
    // @LINE:19
    HelloWorldController_5: controllers.HelloWorldController,
    // @LINE:27
    HomeController_2: controllers.HomeController,
    // @LINE:29
    CountController_0: controllers.CountController,
    // @LINE:31
    AsyncController_4: controllers.AsyncController,
    // @LINE:34
    Assets_6: controllers.Assets
  ) = this(errorHandler, UsersController_1, BooksController_3, HelloWorldController_5, HomeController_2, CountController_0, AsyncController_4, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UsersController_1, BooksController_3, HelloWorldController_5, HomeController_2, CountController_0, AsyncController_4, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UsersController.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/currentuser""", """controllers.UsersController.getCurrentUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UsersController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UsersController.signOutUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UsersController.getAllUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.createBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.getBookById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.updateBookById(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.deleteBookById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getAllBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helloWorld""", """controllers.HelloWorldController.helloWorld()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/mattias""", """controllers.HelloWorldController.helloMattias()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hellos/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hellos(name:String, count:Integer ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greetings""", """controllers.HelloWorldController.greetings()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me""", """controllers.HelloWorldController.me()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_UsersController_registerUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UsersController_registerUser0_invoker = createInvoker(
    UsersController_1.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UsersController_getCurrentUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/currentuser")))
  )
  private[this] lazy val controllers_UsersController_getCurrentUser1_invoker = createInvoker(
    UsersController_1.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/currentuser""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UsersController_signInUser2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UsersController_signInUser2_invoker = createInvoker(
    UsersController_1.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """users/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UsersController_signOutUser3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UsersController_signOutUser3_invoker = createInvoker(
    UsersController_1.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """users/signout""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UsersController_getAllUsers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UsersController_getAllUsers4_invoker = createInvoker(
    UsersController_1.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_createBook5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_createBook5_invoker = createInvoker(
    BooksController_3.createBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "createBook",
      Nil,
      "POST",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_getBookById6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getBookById6_invoker = createInvoker(
    BooksController_3.getBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getBookById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_updateBookById7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_updateBookById7_invoker = createInvoker(
    BooksController_3.updateBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "updateBookById",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_deleteBookById8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_deleteBookById8_invoker = createInvoker(
    BooksController_3.deleteBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "deleteBookById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BooksController_getAllBooks9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getAllBooks9_invoker = createInvoker(
    BooksController_3.getAllBooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getAllBooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HelloWorldController_helloWorld10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helloWorld")))
  )
  private[this] lazy val controllers_HelloWorldController_helloWorld10_invoker = createInvoker(
    HelloWorldController_5.helloWorld(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "helloWorld",
      Nil,
      "GET",
      this.prefix + """helloWorld""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HelloWorldController_helloMattias11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/mattias")))
  )
  private[this] lazy val controllers_HelloWorldController_helloMattias11_invoker = createInvoker(
    HelloWorldController_5.helloMattias(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "helloMattias",
      Nil,
      "GET",
      this.prefix + """hello/mattias""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HelloWorldController_hello12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hello12_invoker = createInvoker(
    HelloWorldController_5.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HelloWorldController_hellos13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hellos/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hellos13_invoker = createInvoker(
    HelloWorldController_5.hellos(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hellos",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """hellos/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HelloWorldController_greetings14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greetings")))
  )
  private[this] lazy val controllers_HelloWorldController_greetings14_invoker = createInvoker(
    HelloWorldController_5.greetings(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "greetings",
      Nil,
      "POST",
      this.prefix + """greetings""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HelloWorldController_me15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me")))
  )
  private[this] lazy val controllers_HelloWorldController_me15_invoker = createInvoker(
    HelloWorldController_5.me(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "me",
      Nil,
      "GET",
      this.prefix + """me""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index16_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CountController_count17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count17_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AsyncController_message18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message18_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_UsersController_registerUser0_route(params@_) =>
      call { 
        controllers_UsersController_registerUser0_invoker.call(UsersController_1.registerUser())
      }
  
    // @LINE:6
    case controllers_UsersController_getCurrentUser1_route(params@_) =>
      call { 
        controllers_UsersController_getCurrentUser1_invoker.call(UsersController_1.getCurrentUser())
      }
  
    // @LINE:7
    case controllers_UsersController_signInUser2_route(params@_) =>
      call { 
        controllers_UsersController_signInUser2_invoker.call(UsersController_1.signInUser())
      }
  
    // @LINE:8
    case controllers_UsersController_signOutUser3_route(params@_) =>
      call { 
        controllers_UsersController_signOutUser3_invoker.call(UsersController_1.signOutUser())
      }
  
    // @LINE:9
    case controllers_UsersController_getAllUsers4_route(params@_) =>
      call { 
        controllers_UsersController_getAllUsers4_invoker.call(UsersController_1.getAllUsers())
      }
  
    // @LINE:12
    case controllers_BooksController_createBook5_route(params@_) =>
      call { 
        controllers_BooksController_createBook5_invoker.call(BooksController_3.createBook())
      }
  
    // @LINE:13
    case controllers_BooksController_getBookById6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_getBookById6_invoker.call(BooksController_3.getBookById(id))
      }
  
    // @LINE:14
    case controllers_BooksController_updateBookById7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_updateBookById7_invoker.call(BooksController_3.updateBookById(id))
      }
  
    // @LINE:15
    case controllers_BooksController_deleteBookById8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_deleteBookById8_invoker.call(BooksController_3.deleteBookById(id))
      }
  
    // @LINE:16
    case controllers_BooksController_getAllBooks9_route(params@_) =>
      call { 
        controllers_BooksController_getAllBooks9_invoker.call(BooksController_3.getAllBooks())
      }
  
    // @LINE:19
    case controllers_HelloWorldController_helloWorld10_route(params@_) =>
      call { 
        controllers_HelloWorldController_helloWorld10_invoker.call(HelloWorldController_5.helloWorld())
      }
  
    // @LINE:20
    case controllers_HelloWorldController_helloMattias11_route(params@_) =>
      call { 
        controllers_HelloWorldController_helloMattias11_invoker.call(HelloWorldController_5.helloMattias())
      }
  
    // @LINE:21
    case controllers_HelloWorldController_hello12_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HelloWorldController_hello12_invoker.call(HelloWorldController_5.hello(name))
      }
  
    // @LINE:22
    case controllers_HelloWorldController_hellos13_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Integer]("count", Some(0))) { (name, count) =>
        controllers_HelloWorldController_hellos13_invoker.call(HelloWorldController_5.hellos(name, count))
      }
  
    // @LINE:23
    case controllers_HelloWorldController_greetings14_route(params@_) =>
      call { 
        controllers_HelloWorldController_greetings14_invoker.call(HelloWorldController_5.greetings())
      }
  
    // @LINE:24
    case controllers_HelloWorldController_me15_route(params@_) =>
      call { 
        controllers_HelloWorldController_me15_invoker.call(HelloWorldController_5.me())
      }
  
    // @LINE:27
    case controllers_HomeController_index16_route(params@_) =>
      call { 
        controllers_HomeController_index16_invoker.call(HomeController_2.index)
      }
  
    // @LINE:29
    case controllers_CountController_count17_route(params@_) =>
      call { 
        controllers_CountController_count17_invoker.call(CountController_0.count)
      }
  
    // @LINE:31
    case controllers_AsyncController_message18_route(params@_) =>
      call { 
        controllers_AsyncController_message18_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:34
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
