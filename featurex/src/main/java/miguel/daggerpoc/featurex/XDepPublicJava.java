package miguel.daggerpoc.featurex;

import javax.inject.Inject;

public class XDepPublicJava {

    private final XDepPkgPrivateJava xDepPkgPrivateJava;

    @Inject
    XDepPublicJava(XDepPkgPrivateJava xDepPkgPrivateJava) {
        this.xDepPkgPrivateJava = xDepPkgPrivateJava;
    }

    public XDepPkgPrivateJava getxDepPkgPrivateJava() {
        return xDepPkgPrivateJava;
    }

    public String call() {
        return " XDepPublicJava called. calling: " + xDepPkgPrivateJava.call();
    }
}
