package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.text.TextUtils;
import com.intercom.input.gallery.GalleryInputDataSource;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GifInputDataSource implements GalleryInputDataSource {
    private static final long DEBOUNCE_DELAY_MS = 300;
    private int currentCount;
    private final Debouncer debouncer;
    private String lastQuery;
    private GalleryInputDataSource.Listener listener;
    private boolean loading;
    private final FeedbackDialog mWindow;
    private final MetricTracker metricTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GifInputDataSource(FeedbackDialog feedbackDialog, MetricTracker metricTracker) {
        Debouncer $r3 = new Debouncer();
        this.debouncer = $r3;
        this.currentCount = 0;
        this.mWindow = feedbackDialog;
        this.metricTracker = metricTracker;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List getImagesFromResponse(java.util.List r11) {
        /*
            r10 = this;
            int r0 = r11.size()
            r10.currentCount = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r10.currentCount
            r1.<init>(r0)
            java.util.Iterator r2 = r11.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r4 = r2.next()
            r6 = r4
            io.intercom.android.sdk.blocks.models.Block r6 = (io.intercom.android.sdk.blocks.models.Block) r6
            r5 = r6
            com.intercom.input.gallery.GalleryImage$Builder r7 = new com.intercom.input.gallery.GalleryImage$Builder
            r7.<init>()
            java.lang.String r8 = r5.getUrl()
            com.intercom.input.gallery.GalleryImage$Builder r7 = r7.withPath(r8)
            java.lang.String r8 = r5.getPreviewUrl()
            com.intercom.input.gallery.GalleryImage$Builder r7 = r7.withPreviewPath(r8)
            java.lang.String r8 = r5.getAttribution()
            com.intercom.input.gallery.GalleryImage$Builder r7 = r7.withAttribution(r8)
            int r0 = r5.getHeight()
            com.intercom.input.gallery.GalleryImage$Builder r7 = r7.withImageHeight(r0)
            int r0 = r5.getWidth()
            com.intercom.input.gallery.GalleryImage$Builder r7 = r7.withImageWidth(r0)
            com.intercom.input.gallery.GalleryImage r9 = r7.build()
            r1.add(r9)
            goto L11
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputDataSource.getImagesFromResponse(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void handleGifResponse(Response response) {
        Object $r3 = response.body();
        GifResponse $r4 = (GifResponse) $r3;
        if ($r4 == null) {
            GalleryInputDataSource.Listener $r1 = this.listener;
            $r1.onError();
            return;
        }
        List $r5 = $r4.results();
        List $r52 = getImagesFromResponse($r5);
        GalleryInputDataSource.Listener $r12 = this.listener;
        $r12.onSuccess($r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void loadDefaultGifs() {
        FeedbackDialog $r1 = this.mWindow;
        $r1.fetchDefaultGifs(new Callback<GifResponse>() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputDataSource.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<GifResponse> call, Throwable th) {
                GifInputDataSource $r4 = GifInputDataSource.this;
                $r4.loading = false;
                GifInputDataSource $r42 = GifInputDataSource.this;
                GalleryInputDataSource.Listener $r12 = $r42.listener;
                $r12.onError();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<GifResponse> call, Response<GifResponse> response) {
                GifInputDataSource $r3 = GifInputDataSource.this;
                $r3.loading = false;
                GifInputDataSource $r32 = GifInputDataSource.this;
                $r32.handleGifResponse(response);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void searchGifs(final String str) {
        MetricTracker $r3 = this.metricTracker;
        $r3.searchedGifInput(str);
        Debouncer $r4 = this.debouncer;
        $r4.call(new Runnable() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputDataSource.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                GifInputDataSource $r42 = GifInputDataSource.this;
                FeedbackDialog $r32 = $r42.mWindow;
                String $r1 = str;
                $r32.fetchGifs($r1, new Callback<GifResponse>() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputDataSource.2.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // io.intercom.retrofit2.Callback
                    public void onFailure(Call<GifResponse> call, Throwable th) {
                        RunnableC102552 $r43 = RunnableC102552.this;
                        GifInputDataSource $r5 = GifInputDataSource.this;
                        $r5.loading = false;
                        RunnableC102552 $r44 = RunnableC102552.this;
                        GifInputDataSource $r52 = GifInputDataSource.this;
                        GalleryInputDataSource.Listener $r12 = $r52.listener;
                        $r12.onError();
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // io.intercom.retrofit2.Callback
                    public void onResponse(Call<GifResponse> call, Response<GifResponse> response) {
                        GifInputDataSource $r43 = GifInputDataSource.this;
                        $r43.loading = false;
                        RunnableC102552 $r33 = RunnableC102552.this;
                        String $r5 = str;
                        GifInputDataSource $r44 = GifInputDataSource.this;
                        String $r6 = $r44.lastQuery;
                        boolean $z0 = $r5.equals($r6);
                        if ($z0) {
                            GifInputDataSource $r45 = GifInputDataSource.this;
                            $r45.handleGifResponse(response);
                        }
                    }
                });
            }
        }, DEBOUNCE_DELAY_MS);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public int getCount() {
        int i0 = this.currentCount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void getImages(int i, String str) {
        this.loading = true;
        this.lastQuery = str;
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            loadDefaultGifs();
        } else {
            searchGifs(str);
        }
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public int getPermissionStatus() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public boolean isLoading() {
        boolean z0 = this.loading;
        return z0;
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void requestPermission() {
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void setListener(GalleryInputDataSource.Listener listener) {
        this.listener = listener;
    }
}
