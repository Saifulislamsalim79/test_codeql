package com.intercom.input.gallery;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C1297b;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.ImageLoader;
import com.intercom.composer.input.InputFragment;
import com.intercom.input.gallery.GalleryInputDataSource;
import com.intercom.input.gallery.adapter.EndlessRecyclerScrollListener;
import com.intercom.input.gallery.adapter.EndlessScrollListener;
import com.intercom.input.gallery.adapter.GalleryRecyclerViewAdapter;
import com.intercom.input.gallery.adapter.OnImageClickListener;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class GalleryInputFragment extends InputFragment implements GalleryInputScreen, OnImageClickListener, EndlessScrollListener {
    private static final String ARG_EXPANDED = "expanded";
    public static final int GALLERY_FULL_SCREEN_REQUEST_CODE = 14;
    FrameLayout contentLayout;
    GalleryInputDataSource dataSource;
    EmptyView emptyLayout;
    EndlessRecyclerScrollListener endlessRecyclerScrollListener;
    boolean expanded;
    GalleryInputExpandedListener galleryInputExpandedListener;
    GalleryOutputListener galleryOutputListener;
    private ImageLoader imageLoader;
    Injector injector;
    LinearLayoutManager layoutManager;
    GalleryRecyclerViewAdapter recyclerAdapter;
    RecyclerView recyclerView;
    final List<GalleryImage> galleryImages = new ArrayList();
    final GalleryInputDataSource.Listener dataListener = new GalleryInputDataSource.Listener() { // from class: com.intercom.input.gallery.GalleryInputFragment.1
        @Override // com.intercom.input.gallery.GalleryInputDataSource.Listener
        public void onError() {
            if (GalleryInputFragment.this.isAdded()) {
                GalleryInputFragment.this.showErrorScreen();
            }
        }

        @Override // com.intercom.input.gallery.GalleryInputDataSource.Listener
        public void onSuccess(List<GalleryImage> list) {
            GalleryInputFragment.this.galleryImages.clear();
            GalleryInputFragment.this.galleryImages.addAll(list);
            GalleryInputFragment galleryInputFragment = GalleryInputFragment.this;
            galleryInputFragment.endlessRecyclerScrollListener.setMaxCount(galleryInputFragment.dataSource.getCount());
            GalleryInputFragment.this.recyclerAdapter.notifyDataSetChanged();
            if (GalleryInputFragment.this.isAdded()) {
                GalleryInputFragment.this.showEmptyOrPermissionScreen(0);
            }
        }
    };
    private final View.OnClickListener expanderClickListener = new View.OnClickListener() { // from class: com.intercom.input.gallery.GalleryInputFragment.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GalleryInputExpandedListener galleryInputExpandedListener = GalleryInputFragment.this.galleryInputExpandedListener;
            if (galleryInputExpandedListener != null) {
                galleryInputExpandedListener.onInputExpanded();
            }
            GalleryInputFragment.this.startActivityForResult(GalleryInputFullScreenActivity.createIntent(GalleryInputFragment.this.getActivity(), GalleryInputFragment.this.getClass(), GalleryInputFragment.this.getArguments()), 14, C1297b.m36458a(GalleryInputFragment.this.getActivity(), C7177R.anim.intercom_composer_slide_up, C7177R.anim.intercom_composer_stay).mo36456c());
        }
    };

    /* loaded from: classes2.dex */
    public interface Injector {
        GalleryInputDataSource getDataSource(GalleryInputFragment galleryInputFragment);

        String getEmptyViewSubtitle(Resources resources);

        String getEmptyViewTitle(Resources resources);

        String getErrorViewSubtitle(Resources resources);

        String getErrorViewTitle(Resources resources);

        View getExpanderButton(ViewGroup viewGroup);

        ImageLoader getImageLoader(GalleryInputFragment galleryInputFragment);

        Class<? extends GalleryLightBoxFragment> getLightBoxFragmentClass(GalleryInputFragment galleryInputFragment);

        View getSearchView(ViewGroup viewGroup);

        int getThemeColor(Context context);

        Toolbar getToolbar(ViewGroup viewGroup);
    }

    public static Bundle createArguments(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_EXPANDED, z);
        return bundle;
    }

    private void setUpAppBar(Injector injector, ViewGroup viewGroup) {
        Toolbar toolbar = injector.getToolbar(viewGroup);
        viewGroup.addView(toolbar);
        getActivity().setSupportActionBar(toolbar);
        AbstractC0925a supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo37602u(true);
            supportActionBar.mo37601v(true);
            supportActionBar.mo37600w(false);
        }
    }

    private void setUpPreviewViews(Injector injector, ViewGroup viewGroup) {
        ImageButton imageButton = (ImageButton) injector.getExpanderButton(this.contentLayout);
        if (imageButton != null) {
            this.contentLayout.addView(imageButton);
            imageButton.setOnClickListener(this.expanderClickListener);
        }
        View searchView = injector.getSearchView(this.contentLayout);
        if (searchView != null) {
            searchView.setOnClickListener(this.expanderClickListener);
            viewGroup.addView(searchView, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPermissionPermanentlyDeniedDialog() {
        new DialogInterfaceC0936d.C0937a(getActivity()).setTitle(C7177R.string.intercom_photo_access_denied).setMessage(C7177R.string.intercom_go_to_device_settings).setPositiveButton(C7177R.string.intercom_app_settings, new DialogInterface.OnClickListener() { // from class: com.intercom.input.gallery.GalleryInputFragment.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GalleryInputFragment.this.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", GalleryInputFragment.this.getActivity().getPackageName(), null)));
            }
        }).setNegativeButton(C7177R.string.intercom_not_now, (DialogInterface.OnClickListener) null).show();
    }

    void checkPermissionAndFetchImages(boolean z) {
        int permissionStatus = this.dataSource.getPermissionStatus();
        if (permissionStatus != 1) {
            if (permissionStatus == 2) {
                showEmptyOrPermissionScreen(permissionStatus);
                if (z) {
                    showPermissionPermanentlyDeniedDialog();
                    return;
                }
                return;
            } else if (permissionStatus != 3) {
                fetchImagesIfNotFetched();
                return;
            }
        }
        showEmptyOrPermissionScreen(permissionStatus);
        if (z) {
            this.dataSource.requestPermission();
        }
    }

    void fetchImagesIfNotFetched() {
        if (this.galleryImages.isEmpty()) {
            this.dataSource.getImages(0, null);
        }
    }

    protected abstract Injector getInjector(GalleryInputFragment galleryInputFragment);

    int getLayoutRes() {
        return this.expanded ? C7177R.C7180layout.intercom_composer_fragment_composer_gallery_expanded : C7177R.C7180layout.intercom_composer_fragment_composer_gallery;
    }

    void launchLightBoxActivity(GalleryImage galleryImage) {
        i activity = getActivity();
        startActivityForResult(GalleryLightBoxActivity.createIntent(activity, galleryImage, getInjector(this).getLightBoxFragmentClass(this)), 14, C1297b.m36458a(activity, C7177R.anim.intercom_composer_slide_up, C7177R.anim.intercom_composer_stay).mo36456c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 14 && i2 == -1) {
            if (this.galleryOutputListener != null) {
                this.galleryOutputListener.onGalleryOutputReceived((GalleryImage) intent.getParcelableExtra(GalleryInputFullScreenActivity.GALLERY_IMAGE));
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof GalleryOutputListener) {
            this.galleryOutputListener = (GalleryOutputListener) context;
        }
        if (context instanceof GalleryInputExpandedListener) {
            this.galleryInputExpandedListener = (GalleryInputExpandedListener) context;
        }
    }

    @Override // com.intercom.composer.input.InputFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.expanded = arguments.getBoolean(ARG_EXPANDED, false);
        }
        if (this.expanded) {
            this.layoutManager = new GridLayoutManager(getContext(), getResources().getInteger(C7177R.integer.intercom_composer_expanded_column_count));
        } else {
            this.layoutManager = new LinearLayoutManager(getContext(), 0, false);
        }
        Injector injector = getInjector(this);
        this.injector = injector;
        GalleryInputDataSource dataSource = injector.getDataSource(this);
        this.dataSource = dataSource;
        dataSource.setListener(this.dataListener);
        this.imageLoader = this.injector.getImageLoader(this);
        this.endlessRecyclerScrollListener = new EndlessRecyclerScrollListener(this.layoutManager, this);
        this.recyclerAdapter = new GalleryRecyclerViewAdapter(LayoutInflater.from(getContext()), this.galleryImages, this.expanded, this, this.imageLoader);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C7177R.C7179id.gallery_root_view);
        this.recyclerView = (RecyclerView) inflate.findViewById(C7177R.C7179id.gallery_recycler_view);
        this.emptyLayout = (EmptyView) inflate.findViewById(C7177R.C7179id.gallery_empty_view);
        this.contentLayout = (FrameLayout) inflate.findViewById(C7177R.C7179id.gallery_content_layout);
        if (this.expanded) {
            setUpAppBar(this.injector, viewGroup2);
            this.recyclerView.m35294h(new HeadingMarginDecoration(C7177R.dimen.intercom_composer_toolbar_height));
        } else {
            setUpPreviewViews(this.injector, viewGroup2);
        }
        this.emptyLayout.setActionButtonClickListener(new View.OnClickListener() { // from class: com.intercom.input.gallery.GalleryInputFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int permissionStatus = GalleryInputFragment.this.dataSource.getPermissionStatus();
                if (permissionStatus != 1) {
                    if (permissionStatus == 2) {
                        GalleryInputFragment.this.showPermissionPermanentlyDeniedDialog();
                        return;
                    } else if (permissionStatus != 3) {
                        return;
                    }
                }
                GalleryInputFragment.this.dataSource.requestPermission();
            }
        });
        this.emptyLayout.setThemeColor(this.injector.getThemeColor(getContext()));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.recyclerView.m35304d1(this.endlessRecyclerScrollListener);
        this.recyclerView.setLayoutManager(null);
    }

    @Override // com.intercom.input.gallery.adapter.OnImageClickListener
    public void onImageClicked(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        int adapterPosition = abstractC1620e0.getAdapterPosition();
        if (adapterPosition <= -1 || adapterPosition >= this.recyclerAdapter.getItemCount()) {
            return;
        }
        launchLightBoxActivity(this.recyclerAdapter.getItem(adapterPosition));
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputDeselected() {
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputReselected() {
    }

    @Override // com.intercom.composer.input.InputFragment
    public void onInputSelected() {
        checkPermissionAndFetchImages(true);
    }

    @Override // com.intercom.input.gallery.adapter.EndlessScrollListener
    public void onLoadMore() {
        if (this.galleryImages.isEmpty() || this.dataSource.isLoading()) {
            return;
        }
        this.dataSource.getImages(this.galleryImages.size(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        checkPermissionAndFetchImages(false);
    }

    @Override // com.intercom.composer.input.InputFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.recyclerView.setAdapter(this.recyclerAdapter);
        this.recyclerView.m35282l(this.endlessRecyclerScrollListener);
        if (this.expanded) {
            onInputSelected();
        }
        this.endlessRecyclerScrollListener.setMaxCount(this.dataSource.getCount());
    }

    @Override // com.intercom.composer.input.InputFragment
    protected void passDataOnViewCreated(Bundle bundle) {
    }

    public void setGalleryExpandedListener(GalleryInputExpandedListener galleryInputExpandedListener) {
        this.galleryInputExpandedListener = galleryInputExpandedListener;
    }

    public void setGalleryListener(GalleryOutputListener galleryOutputListener) {
        this.galleryOutputListener = galleryOutputListener;
    }

    void showEmptyOrPermissionScreen(int i) {
        if (i == 0) {
            if (this.galleryImages.isEmpty()) {
                this.emptyLayout.setVisibility(0);
                this.emptyLayout.setActionButtonVisibility(8);
                this.emptyLayout.setTitle(this.injector.getEmptyViewTitle(getResources()));
                this.emptyLayout.setSubtitle(this.injector.getEmptyViewSubtitle(getResources()));
                this.contentLayout.setVisibility(8);
                return;
            }
            this.emptyLayout.setVisibility(8);
            this.contentLayout.setVisibility(0);
        } else if (i == 1 || i == 2) {
            this.emptyLayout.setVisibility(0);
            this.emptyLayout.setTitle(C7177R.string.intercom_photo_access_denied);
            this.emptyLayout.setSubtitle(C7177R.string.intercom_allow_storage_access);
            this.emptyLayout.setActionButtonVisibility(0);
            this.contentLayout.setVisibility(8);
        } else if (i != 3) {
        } else {
            this.emptyLayout.setVisibility(0);
            this.emptyLayout.setTitle(C7177R.string.intercom_access_photos);
            this.emptyLayout.setSubtitle(C7177R.string.intercom_storage_access_request);
            this.emptyLayout.setActionButtonVisibility(8);
            this.contentLayout.setVisibility(8);
        }
    }

    void showErrorScreen() {
        this.emptyLayout.setVisibility(0);
        this.emptyLayout.setActionButtonVisibility(8);
        this.emptyLayout.setTitle(this.injector.getErrorViewTitle(getResources()));
        this.emptyLayout.setSubtitle(this.injector.getErrorViewSubtitle(getResources()));
        this.contentLayout.setVisibility(8);
    }
}
