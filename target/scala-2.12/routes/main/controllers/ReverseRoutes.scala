// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/Crime_backend/conf/routes
// @DATE:Thu Feb 07 15:41:27 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:29
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:5
  class ReverseUsersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def getCurrentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/currentuser")
    }
  
    // @LINE:7
    def signInUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:5
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:8
    def signOutUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signout")
    }
  
    // @LINE:9
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:19
  class ReverseHelloWorldController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def hello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:24
    def me(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "me")
    }
  
    // @LINE:22
    def hellos(name:String, count:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hellos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + play.core.routing.queryString(List(if(count == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("count", count)))))
    }
  
    // @LINE:20
    def helloMattias(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/mattias")
    }
  
    // @LINE:19
    def helloWorld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helloWorld")
    }
  
    // @LINE:23
    def greetings(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "greetings")
    }
  
  }

  // @LINE:12
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def deleteBookById(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def getBookById(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def getAllBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:14
    def updateBookById(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:12
    def createBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books")
    }
  
  }

  // @LINE:27
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:31
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
