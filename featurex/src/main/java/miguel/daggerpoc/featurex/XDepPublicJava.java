package miguel.daggerpoc.featurex;

public class XDepPublicJava {

    private final XDepPkgPrivateJava xDepPkgPrivateJava;

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
