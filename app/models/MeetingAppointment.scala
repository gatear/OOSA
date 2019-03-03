package models

import play.api.libs.json.{JsValue, Json, Writes}

case class MeetingAppointment(id         : Long,
                              owner      : String,
                              location   : String,
                              startDate  : String,
                              duration   : String,
                              endDate    : String,
                              description: String)

object MeetingAppointment {
  implicit val meetingAppointmentWrites = new Writes[MeetingAppointment] {
    override def writes(meetingAppointment: MeetingAppointment): JsValue = Json.obj (
      "ID"    -> meetingAppointment.id,
      "Owner"         -> meetingAppointment.owner,
      "Location"      -> meetingAppointment.location,
      "Start_Date"    -> meetingAppointment.startDate,
      "End_Date"      -> meetingAppointment.endDate,
      "Duration"      -> meetingAppointment.duration,
      "Description"   -> meetingAppointment.description
    )
  }

}
