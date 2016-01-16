package com.vassilis.sample.resources;


import com.vassilis.sample.model.Article;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * Created by vassilis on 16/01/16.
 */
@Path("/blog")
class BlogResource {
    private static Logger log = Logger.getLogger(BlogResource.class);

    @GET
    @Produces("text/plain")
    public String home() {
        log.info("entering rest point home method");
        return "Hello from blog resource";
    }


    @Path("/article/{articleId}")
    @GET
    @Produces("application/json")
    public Article getArticle(@PathParam("articleId") int articeId) {
        log.info("entering rest point getArticles");

        //1. getArticle
        Article article = new Article(articeId);

        return article;
    }
}
