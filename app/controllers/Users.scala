package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Users extends Controller {
  
  def find(id: Int) = Action { request =>
    Ok(
      Json.obj(
        "id" -> id,
        "name" -> "Kobe Bryant",
        "email" -> "kobe@gmail.com"
      )
    )
  }
}
