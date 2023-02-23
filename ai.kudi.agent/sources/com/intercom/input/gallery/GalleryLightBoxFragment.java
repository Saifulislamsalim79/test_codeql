package com.intercom.input.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.intercom.composer.ImageLoader;
/* loaded from: classes2.dex */
public abstract class GalleryLightBoxFragment extends Fragment implements View.OnClickListener {
    GalleryImage galleryImage;
    private ImageLoader imageLoader;

    /* loaded from: classes2.dex */
    public interface Injector {
        ImageLoader getImageLoader(GalleryLightBoxFragment galleryLightBoxFragment);
    }

    public static Bundle createArgs(GalleryImage galleryImage) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(GalleryInputFullScreenActivity.GALLERY_IMAGE, galleryImage);
        return bundle;
    }

    protected abstract Injector getInjector(GalleryLightBoxFragment galleryLightBoxFragment);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C7177R.C7179id.lightbox_send_button) {
            Intent intent = new Intent();
            intent.putExtra(GalleryInputFullScreenActivity.GALLERY_IMAGE, this.galleryImage);
            getActivity().setResult(-1, intent);
        }
        getActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.galleryImage = (GalleryImage) getArguments().getParcelable(GalleryInputFullScreenActivity.GALLERY_IMAGE);
        this.imageLoader = getInjector(this).getImageLoader(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7177R.C7180layout.intercom_composer_gallery_lightbox_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.imageLoader.loadImageIntoView(this.galleryImage, (ImageView) view.findViewById(C7177R.C7179id.lightbox_image));
        view.findViewById(C7177R.C7179id.lightbox_send_button).setOnClickListener(this);
        view.findViewById(C7177R.C7179id.lightbox_close_button).setOnClickListener(this);
    }
}
