package com.intercom.input.gallery;

import com.intercom.composer.Creator;
import com.intercom.composer.input.IconProvider;
import com.intercom.composer.input.Input;
/* loaded from: classes2.dex */
public class GalleryInput extends Input<GalleryInputFragment> {
    private final Creator<GalleryInputFragment> fragmentCreator;
    private final GalleryInputExpandedListener galleryInputExpandedListener;
    private final GalleryOutputListener galleryOutputListener;

    public GalleryInput(String str, IconProvider iconProvider, GalleryOutputListener galleryOutputListener, GalleryInputExpandedListener galleryInputExpandedListener, Creator<GalleryInputFragment> creator) {
        super(str, iconProvider);
        this.galleryOutputListener = galleryOutputListener;
        this.galleryInputExpandedListener = galleryInputExpandedListener;
        this.fragmentCreator = creator;
    }

    @Override // com.intercom.composer.input.Input
    public GalleryInputFragment createFragment() {
        GalleryInputFragment create = this.fragmentCreator.create();
        create.setArguments(GalleryInputFragment.createArguments(false));
        create.setGalleryListener(this.galleryOutputListener);
        create.setGalleryExpandedListener(this.galleryInputExpandedListener);
        return create;
    }
}
