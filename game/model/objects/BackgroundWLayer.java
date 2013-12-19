public class BackgroundWLayer implements WLayer {
    private String bg_image;
    private final BgWLBuilder BG_BUILDER = new BgWLBuilder();
    
    public BackgroundWLayer( BgWLBuilder bgbuilder ) {
        bg_image = bgbuilder.bg_image;
    }

    public WLBuilder builder() {
        return BG_BUILDER;
    }

    private class BgWLBuilder implements WLBuilder {
        public String gb_image;
        public BgWLBuilder withImageFile( String image ) {
            gb_image = image;
        }
        public WLayer build() {
            return new BackgroundWLayer(this);
        }
    }
}
