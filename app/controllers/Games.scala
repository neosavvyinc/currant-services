package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Games extends Controller {
  
  def find(id: Int) = Action { request =>
    Ok(
      Json.obj(
        "id" -> id,
        "sport" -> "Soccer",
        "location" -> "Brooklyn, NY",
        "clubId" -> 1
      )
    )
  }

  def findAll(location: Option[String]) = Action {
    Ok(
      Json.obj(
        "id" -> 123,
        "sport" -> "Flag Football",
        "location" -> location,
        "clubId" -> 1
      )
    )
  }
}
