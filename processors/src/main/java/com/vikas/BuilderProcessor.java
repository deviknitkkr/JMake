package com.vikas;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.LinkedHashSet;
import java.util.Set;

@AutoService(Processor.class)
@SupportedSourceVersion(value = SourceVersion.RELEASE_15)

public class BuilderProcessor extends AbstractProcessor {

    Messager messager;
    public BuilderProcessor() {
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager=processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.MANDATORY_WARNING,"Annotation processing started...");
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for(Element element: roundEnv.getElementsAnnotatedWith(Builder.class)){
            messager.printMessage(Diagnostic.Kind.WARNING,"Processing:"+element.getSimpleName());
        }
        return true;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> set=new LinkedHashSet<>();
        set.add(Builder.class.getCanonicalName());
        return set;
    }
}
