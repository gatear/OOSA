package controllers

import javax.inject.Inject
import play.api.db.Database
import play.api.mvc.{BaseController, ControllerComponents}

class ScheduleController @Inject()(db: Database, val controllerComponents: ControllerComponents) extends BaseController {
  def index = Action {
    Ok(views.html.schedule("Form ready!"))
  }
}
