
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.96*/("""

"""),_display_(/*3.2*/main("Product Details",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""


  """),format.raw/*6.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*8.8*/if(flash.containsKey("success"))/*8.40*/ {_display_(Seq[Any](format.raw/*8.42*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-success">
          """),_display_(/*10.12*/flash/*10.17*/.get("success")),format.raw/*10.32*/("""
        """),format.raw/*11.9*/("""</div>
      """)))}),format.raw/*12.8*/("""
      """),format.raw/*13.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*27.10*/for(p<-products) yield /*27.26*/ {_display_(Seq[Any](format.raw/*27.28*/("""
            """),_display_(/*28.14*/if(p.getId() == id)/*28.33*/{_display_(Seq[Any](format.raw/*28.34*/("""

          """),format.raw/*30.11*/("""<tr>
            """),_display_(/*31.14*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*31.102*/{_display_(Seq[Any](format.raw/*31.103*/("""
              """),format.raw/*32.15*/("""<td><img src="/assets/images/productImages/largeImages/"""),_display_(/*32.71*/(p.getId + ".jpg")),format.raw/*32.89*/(""""/></td>
            """)))}/*33.15*/else/*33.20*/{_display_(Seq[Any](format.raw/*33.21*/("""
              """),format.raw/*34.15*/("""<td><img src ="/assets/images/productImages/largeImages/noImage.jpg"/></td>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""<td class="numeric">"""),_display_(/*36.34*/p/*36.35*/.getId),format.raw/*36.41*/("""</td>
            <td>"""),_display_(/*37.18*/p/*37.19*/.getName),format.raw/*37.27*/("""</td>
            <td>"""),_display_(/*38.18*/p/*38.19*/.getCategory.getName),format.raw/*38.39*/("""</td>        
            <td>"""),_display_(/*39.18*/p/*39.19*/.getDescription),format.raw/*39.34*/("""</td>
            <td  class="numeric">"""),_display_(/*40.35*/p/*40.36*/.getStock),format.raw/*40.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*41.37*/("%.2f".format(p.getPrice))),format.raw/*41.64*/("""</td>
            <td>
              <a href=""""),_display_(/*43.25*/routes/*43.31*/.HomeController.updateProduct(p.getId)),format.raw/*43.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*47.25*/routes/*47.31*/.HomeController.deleteProduct(p.getId)),format.raw/*47.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>

        """)))}),format.raw/*53.10*/("""
        """)))}),format.raw/*54.10*/("""
      """),format.raw/*55.7*/("""</tbody>

    </table>

    <p>
      <!-- <a href=""""),_display_(/*60.22*/routes/*60.28*/.HomeController.addProduct()),format.raw/*60.56*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a> -->
    </p>
  </div>
</div>
""")))}),format.raw/*66.2*/("""
"""))
      }
    }
  }

  def render(id:Long,products:List[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(id,products,user,env)

  def f:((Long,List[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (id,products,user,env) => apply(id,products,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 13:39:38 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/productDetails.scala.html
                  HASH: 2d8dba3055386bd87ebc7cdc1932d0fa0c4c7b0a
                  MATRIX: 1015->1|1204->95|1232->98|1268->126|1307->128|1338->133|1463->233|1503->265|1542->267|1577->276|1649->321|1663->326|1699->341|1735->350|1779->364|1813->371|2132->663|2164->679|2204->681|2245->695|2273->714|2312->715|2352->727|2397->745|2495->833|2535->834|2578->849|2661->905|2700->923|2741->946|2754->951|2793->952|2836->967|2956->1056|2997->1069|3045->1090|3055->1091|3082->1097|3132->1120|3142->1121|3171->1129|3221->1152|3231->1153|3272->1173|3330->1204|3340->1205|3376->1220|3443->1260|3453->1261|3483->1270|3552->1312|3600->1339|3674->1386|3689->1392|3748->1430|3945->1600|3960->1606|4019->1644|4240->1834|4281->1844|4315->1851|4395->1904|4410->1910|4459->1938|4596->2045
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|59->27|59->27|59->27|60->28|60->28|60->28|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|67->35|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|75->43|75->43|75->43|79->47|79->47|79->47|85->53|86->54|87->55|92->60|92->60|92->60|98->66
                  -- GENERATED --
              */
          