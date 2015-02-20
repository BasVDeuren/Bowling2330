package be.bowling.model.support.builder;

import org.springframework.web.servlet.ModelAndView;

public class ModelAndViewBuilder {
  ModelAndView modelAndView;

  public ModelAndViewBuilder() {
    modelAndView = new ModelAndView();
  }

  public ModelAndView build(){
    return this.modelAndView;
  }

  public ModelAndViewBuilder withViewName(String viewName) {
    this.modelAndView.setViewName(viewName);
    return this;
  }
}
