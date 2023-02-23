package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.VideoView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.video.AudioServiceContext;
import io.intercom.android.sdk.video.IntercomMediaController;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
/* loaded from: classes.dex */
public class IntercomVideoActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, View.OnClickListener {
    private static final String PARCEL_VIDEO_URL = "parcel_video_url";
    private IntercomToolbar intercomToolbar;
    private ProgressBar loadingView;
    private MediaController mediaController;
    private MetricTracker metricTracker;
    private VideoView videoView;
    private FrameLayout videoViewOverlay;
    private WallpaperLoader wallpaperLoader;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildIntent(Context context, String str) {
        Intent $r1 = new Intent(context, IntercomVideoActivity.class);
        $r1.putExtra(PARCEL_VIDEO_URL, str);
        $r1.addFlags(268435456);
        $r1.addFlags(536870912);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void closeActivity() {
        finish();
        int $i0 = C10110R.anim.intercom_video_slide_out_down;
        overridePendingTransition(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initVideoPlayer(final String str) {
        IntercomToolbar $r4 = this.intercomToolbar;
        MediaController r10 = new IntercomMediaController(this, $r4);
        MediaController r14 = r10;
        this.mediaController = r14;
        VideoView $r5 = this.videoView;
        MediaController r142 = r10;
        $r5.setMediaController(r142);
        VideoView $r52 = this.videoView;
        Uri $r1 = Uri.parse(str);
        $r52.setVideoURI($r1);
        VideoView $r53 = this.videoView;
        $r53.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: io.intercom.android.sdk.activities.IntercomVideoActivity.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                IntercomVideoActivity $r2 = IntercomVideoActivity.this;
                MetricTracker $r3 = $r2.metricTracker;
                String $r42 = str;
                int $i0 = mediaPlayer.getVideoWidth();
                int $i1 = mediaPlayer.getVideoHeight();
                $r3.loadedVideo($r42, $i0, $i1);
                IntercomVideoActivity $r22 = IntercomVideoActivity.this;
                MediaController $r54 = $r22.mediaController;
                $r54.show();
                IntercomVideoActivity $r23 = IntercomVideoActivity.this;
                MediaController $r55 = $r23.mediaController;
                $r23.styleMediaController($r55);
                IntercomVideoActivity $r24 = IntercomVideoActivity.this;
                VideoView $r6 = $r24.videoView;
                $r6.start();
                IntercomVideoActivity $r25 = IntercomVideoActivity.this;
                ProgressBar $r7 = $r25.loadingView;
                $r7.setVisibility(8);
                IntercomVideoActivity $r26 = IntercomVideoActivity.this;
                FrameLayout $r8 = $r26.videoViewOverlay;
                $r8.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomVideoActivity.1.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public void run() {
                        C101441 $r12 = C101441.this;
                        IntercomVideoActivity $r27 = IntercomVideoActivity.this;
                        FrameLayout $r32 = $r27.videoViewOverlay;
                        $r32.setBackgroundColor(0);
                        C101441 $r13 = C101441.this;
                        IntercomVideoActivity $r28 = IntercomVideoActivity.this;
                        ProgressBar $r43 = $r28.loadingView;
                        $r43.setVisibility(8);
                    }
                }, 200L);
            }
        });
        VideoView $r54 = this.videoView;
        $r54.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: io.intercom.android.sdk.activities.IntercomVideoActivity.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                IntercomVideoActivity $r3 = IntercomVideoActivity.this;
                MetricTracker $r12 = $r3.metricTracker;
                String $r42 = str;
                $r12.failedToPlayVideo($r42);
                return false;
            }
        });
        VideoView $r55 = this.videoView;
        $r55.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: io.intercom.android.sdk.activities.IntercomVideoActivity.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                IntercomVideoActivity $r3 = IntercomVideoActivity.this;
                MetricTracker $r12 = $r3.metricTracker;
                $r12.completedVideo();
            }
        });
        FrameLayout $r9 = this.videoViewOverlay;
        $r9.setOnClickListener(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setupToolbar(Provider provider) {
        ViewGroup $r2 = this.intercomToolbar;
        Object $r3 = provider.get();
        AppConfig $r4 = (AppConfig) $r3;
        int $i0 = $r4.getSecondaryColor();
        ViewGroup r7 = $r2;
        r7.setBackgroundColor($i0);
        IntercomToolbar $r22 = this.intercomToolbar;
        $r22.setLeftNavigationItemVisibility(0);
        IntercomToolbar $r23 = this.intercomToolbar;
        $r23.setCloseButtonVisibility(8);
        IntercomToolbar $r24 = this.intercomToolbar;
        $r24.updateToolbarSize();
        C10486i $r5 = ComponentCallbacks2C10478c.u(this);
        WallpaperLoader $r6 = WallpaperLoader.create(this, provider, $r5);
        this.wallpaperLoader = $r6;
        IntercomToolbar $r25 = this.intercomToolbar;
        $r25.loadWallpaper($r6);
        IntercomToolbar $r26 = this.intercomToolbar;
        $r26.setListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void styleMediaController(View $r1) {
        Resources $r2 = getResources();
        int $i1 = $r2.getColor(C10110R.color.intercom_white);
        boolean $z0 = $r1 instanceof MediaController;
        int $i0 = 0;
        if ($z0) {
            MediaController $r3 = (MediaController) $r1;
            while ($i0 < $r3.getChildCount()) {
                styleMediaController($r3.getChildAt($i0));
                $i0++;
            }
            return;
        }
        boolean $z02 = $r1 instanceof LinearLayout;
        if ($z02) {
            LinearLayout $r4 = (LinearLayout) $r1;
            while ($i0 < $r4.getChildCount()) {
                styleMediaController($r4.getChildAt($i0));
                $i0++;
            }
            return;
        }
        boolean $z03 = $r1 instanceof SeekBar;
        if ($z03) {
            SeekBar $r5 = (SeekBar) $r1;
            Drawable $r6 = $r5.getProgressDrawable();
            Drawable $r62 = $r6.mutate();
            PorterDuff.Mode $r7 = PorterDuff.Mode.SRC_IN;
            $r62.setColorFilter($i1, $r7);
            if (Build.VERSION.SDK_INT >= 21) {
                Drawable $r63 = $r5.getThumb();
                Drawable $r64 = $r63.mutate();
                PorterDuff.Mode $r72 = PorterDuff.Mode.SRC_IN;
                $r64.setColorFilter($i1, $r72);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ContextWrapper $r1 = AudioServiceContext.preventLeakOf(context);
        super.attachBaseContext($r1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        closeActivity();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MediaController $r2 = this.mediaController;
        boolean $z0 = $r2.isShowing();
        if ($z0) {
            MediaController $r22 = this.mediaController;
            $r22.hide();
            return;
        }
        MediaController $r23 = this.mediaController;
        $r23.show();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = C10110R.C10113layout.intercom_activity_video;
        setContentView($i0);
        int $i02 = C10110R.C10112id.loading_view;
        View $r2 = findViewById($i02);
        ProgressBar $r3 = (ProgressBar) $r2;
        this.loadingView = $r3;
        int $i03 = C10110R.C10112id.video_view;
        View $r22 = findViewById($i03);
        VideoView $r4 = (VideoView) $r22;
        this.videoView = $r4;
        int $i04 = C10110R.C10112id.intercom_toolbar;
        View $r23 = findViewById($i04);
        IntercomToolbar $r5 = (IntercomToolbar) $r23;
        this.intercomToolbar = $r5;
        int $i05 = C10110R.C10112id.video_view_overlay;
        View $r24 = findViewById($i05);
        FrameLayout $r6 = (FrameLayout) $r24;
        this.videoViewOverlay = $r6;
        Injector $r7 = Injector.get();
        Provider $r8 = $r7.getAppConfigProvider();
        MetricTracker $r9 = $r7.getMetricTracker();
        this.metricTracker = $r9;
        setupToolbar($r8);
        Intent $r10 = getIntent();
        Bundle $r1 = $r10.getExtras();
        String $r11 = $r1 != null ? $r1.getString(PARCEL_VIDEO_URL, "") : "";
        int $i06 = C10110R.anim.intercom_video_slide_up_in;
        overridePendingTransition($i06, 0);
        boolean $z0 = TextUtils.isEmpty($r11);
        if ($z0) {
            finish();
        } else {
            initVideoPlayer($r11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IntercomToolbar $r1 = this.intercomToolbar;
        WallpaperLoader $r2 = this.wallpaperLoader;
        $r1.closeWallpaperLoader($r2);
        super.onDestroy();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        closeActivity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        VideoView $r1 = this.videoView;
        $r1.stopPlayback();
        super.onStop();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }
}
