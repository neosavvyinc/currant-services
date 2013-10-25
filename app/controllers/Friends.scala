package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Friends extends Controller {
  
  def findAll(userId: Int) = Action { request =>

    Ok(
      Json.arr(

        Json.obj(
          "id" -> 123,
          "name" -> "Kobe Bryant",
          "email" -> "kobe@gmail.com"
        ),

        Json.obj(
          "id" -> 234,
          "name" -> "Karl Malone",
          "email" -> "karl@gmail.com"
        )
      )
    )
  
  }

  def add(userId: Int) = Action { request =>
    Ok("new user added") 
  }
}
