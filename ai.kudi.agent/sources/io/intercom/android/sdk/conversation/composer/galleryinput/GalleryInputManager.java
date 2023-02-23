package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.intercom.composer.Creator;
import com.intercom.composer.input.IconProvider;
import com.intercom.composer.input.Input;
import com.intercom.input.gallery.GalleryImage;
import com.intercom.input.gallery.GalleryInput;
import com.intercom.input.gallery.GalleryInputExpandedListener;
import com.intercom.input.gallery.GalleryInputFragment;
import com.intercom.input.gallery.GalleryOutputListener;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.conversation.composer.ComposerInputIndentifier;
import io.intercom.android.sdk.conversation.composer.ComposerPresenter;
import io.intercom.android.sdk.conversation.composer.InputDrawableManager;
import io.intercom.android.sdk.metrics.MetricTracker;
/* loaded from: classes.dex */
public class GalleryInputManager {
    private static final String INPUT_EXPANDED_PREFIX = "expanded_";
    private String conversationId;
    private final Drawable galleryIcon;
    private final Drawable gifIcon;
    private final ComposerPresenter.Listener listener;
    private final MetricTracker metricTracker;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GalleryInputManager(Context context, InputDrawableManager inputDrawableManager, ComposerPresenter.Listener listener, MetricTracker metricTracker, String str) {
        this.listener = listener;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        int $i0 = C10110R.C10111drawable.intercom_input_gallery;
        Drawable $r6 = inputDrawableManager.createDrawable(context, $i0);
        this.galleryIcon = $r6;
        int $i02 = C10110R.C10111drawable.intercom_input_gif;
        Drawable $r62 = inputDrawableManager.createDrawable(context, $i02);
        this.gifIcon = $r62;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Input createGalleryInput() {
        GalleryInput $r5 = new GalleryInput(ComposerInputIndentifier.GALLERY, new IconProvider() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.input.IconProvider
            public Drawable getIconDrawable(String str, Context context) {
                GalleryInputManager $r4 = GalleryInputManager.this;
                Drawable $r2 = $r4.galleryIcon;
                return $r2;
            }
        }, new GalleryOutputListener() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.input.gallery.GalleryOutputListener
            public void onGalleryOutputReceived(GalleryImage galleryImage) {
                GalleryInputManager $r3 = GalleryInputManager.this;
                ComposerPresenter.Listener $r2 = $r3.listener;
                $r2.onUploadImageSelected(galleryImage);
            }
        }, new GalleryInputExpandedListener() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.input.gallery.GalleryInputExpandedListener
            public void onInputExpanded() {
                GalleryInputManager $r1 = GalleryInputManager.this;
                MetricTracker $r2 = $r1.metricTracker;
                GalleryInputManager $r12 = GalleryInputManager.this;
                String $r3 = $r12.conversationId;
                $r2.expandedInput($r3, "expanded_gallery_input");
            }
        }, new Creator<GalleryInputFragment>() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.intercom.composer.Creator
            public GalleryInputFragment create() {
                LocalGalleryInputFragment $r1 = new LocalGalleryInputFragment();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.Creator
            public /* bridge */ /* synthetic */ GalleryInputFragment create() {
                GalleryInputFragment $r1 = create();
                return $r1;
            }
        });
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Input createGifInput() {
        GalleryInput $r5 = new GalleryInput("gif_input", new IconProvider() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.input.IconProvider
            public Drawable getIconDrawable(String str, Context context) {
                GalleryInputManager $r4 = GalleryInputManager.this;
                Drawable $r2 = $r4.gifIcon;
                return $r2;
            }
        }, new GalleryOutputListener() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.input.gallery.GalleryOutputListener
            public void onGalleryOutputReceived(GalleryImage galleryImage) {
                GalleryInputManager $r3 = GalleryInputManager.this;
                ComposerPresenter.Listener $r2 = $r3.listener;
                $r2.onRemoteImageSelected(galleryImage);
            }
        }, new GalleryInputExpandedListener() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.input.gallery.GalleryInputExpandedListener
            public void onInputExpanded() {
                GalleryInputManager $r1 = GalleryInputManager.this;
                MetricTracker $r2 = $r1.metricTracker;
                GalleryInputManager $r12 = GalleryInputManager.this;
                String $r3 = $r12.conversationId;
                $r2.expandedInput($r3, MetricTracker.Object.EXPANDED_GIF_INPUT);
            }
        }, new Creator<GalleryInputFragment>() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryInputManager.8
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.intercom.composer.Creator
            public GalleryInputFragment create() {
                GifInputFragment $r1 = new GifInputFragment();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.composer.Creator
            public /* bridge */ /* synthetic */ GalleryInputFragment create() {
                GalleryInputFragment $r1 = create();
                return $r1;
            }
        });
        return $r5;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }
}
