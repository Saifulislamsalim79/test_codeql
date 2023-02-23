package io.intercom.android.sdk.lightbox;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.e;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.transforms.RoundedCornersTransform;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
/* loaded from: classes3.dex */
public class LightBoxActivity extends e implements LightBoxListener {
    private static final int ANIMATION_TIME_MS = 300;
    private static final String EXTRA_ACTIVITY_FULLSCREEN = "extra_activity_fullscreen";
    private static final String EXTRA_IMAGE_URL = "extra_image_url";
    public static final String TRANSITION_KEY = "lightbox_image";
    private String imageUrl = "";
    ViewGroup rootView;

    /* JADX WARN: Multi-variable type inference failed */
    private void fadeIn() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C1335a.m36324d(this, C10110R.color.intercom_full_transparent_full_black)), Integer.valueOf(C1335a.m36324d(this, C10110R.color.intercom_transparent_black_lightbox)));
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fadeOut() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C1335a.m36324d(this, C10110R.color.intercom_transparent_black_lightbox)), Integer.valueOf(C1335a.m36324d(this, C10110R.color.intercom_full_transparent_full_black)));
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    public static Intent imageIntent(Context context, String str, boolean z) {
        return new Intent(context, LightBoxActivity.class).putExtra(EXTRA_IMAGE_URL, str).putExtra(EXTRA_ACTIVITY_FULLSCREEN, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(C10856g c10856g, ImageView imageView) {
        C10483h<Drawable> m12977i = ComponentCallbacks2C10478c.m13016u(this).m12977i(this.imageUrl);
        m12977i.m12986u(C10783c.m12343h());
        m12977i.m13004b(c10856g);
        m12977i.m12994l(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void reloadAfterTransition(final C10856g c10856g, final LightBoxImageView lightBoxImageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C102961 c102961 = C102961.this;
                            LightBoxActivity.this.loadImage(c10856g, lightBoxImageView);
                        }
                    }, 10L);
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }
            });
        }
    }

    @Override // io.intercom.android.sdk.lightbox.LightBoxListener
    public void closeLightBox() {
        fadeOut();
        supportFinishAfterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        closeLightBox();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.imageUrl = extras.getString(EXTRA_IMAGE_URL, "");
            if (extras.getBoolean(EXTRA_ACTIVITY_FULLSCREEN, false)) {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
        }
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        setContentView(C10110R.C10113layout.intercom_activity_lightbox);
        this.rootView = (ViewGroup) findViewById(C10110R.C10112id.root_view);
        LightBoxImageView lightBoxImageView = (LightBoxImageView) findViewById(C10110R.C10112id.full_image);
        if (Build.VERSION.SDK_INT >= 21) {
            lightBoxImageView.setTransitionName(TRANSITION_KEY);
        }
        C10856g m12144f = new C10856g().m12133l0(new RoundedCornersTransform(getResources().getDimensionPixelSize(C10110R.dimen.intercom_image_rounded_corners))).m12137j(C10110R.C10111drawable.intercom_error).m12144f(ImageUtils.getDiskCacheStrategy(this.imageUrl));
        loadImage(m12144f, lightBoxImageView);
        reloadAfterTransition(m12144f, lightBoxImageView);
        lightBoxImageView.setLightBoxListener(this);
        fadeIn();
    }
}
