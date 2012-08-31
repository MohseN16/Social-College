/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import org.debux.webmotion.server.WebMotionController;
import org.debux.webmotion.server.render.Render;

/**
 *
 * @author mohsen
 */
public class DashboardController  extends WebMotionController{
    public  Render index()
    {
        return  this.renderView("/dashboard/index.jsp");
    }
}
