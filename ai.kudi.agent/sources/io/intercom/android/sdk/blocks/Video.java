package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.VideoBlock;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.okhttp3.Call;
import io.intercom.okhttp3.Callback;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.ResponseBody;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class Video implements VideoBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final FeedbackDialog rdns;
    private final C10486i requestManager;
    private final StyleType style;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.blocks.Video$5 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C101965 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$blocks$VideoProvider;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            VideoProvider[] $r4 = VideoProvider.values();
            int $i0 = $r4.length;
            int[] $r5 = new int[$i0];
            $SwitchMap$io$intercom$android$blocks$VideoProvider = $r5;
            try {
                VideoProvider $r6 = VideoProvider.WISTIA;
                int $i02 = $r6.ordinal();
                $r5[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r52 = $SwitchMap$io$intercom$android$blocks$VideoProvider;
                VideoProvider $r62 = VideoProvider.YOUTUBE;
                int $i03 = $r62.ordinal();
                $r52[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r53 = $SwitchMap$io$intercom$android$blocks$VideoProvider;
                VideoProvider $r63 = VideoProvider.VIMEO;
                int $i04 = $r63.ordinal();
                $r53[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r54 = $SwitchMap$io$intercom$android$blocks$VideoProvider;
                VideoProvider $r64 = VideoProvider.LOOM;
                int $i05 = $r64.ordinal();
                $r54[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Video(StyleType styleType, FeedbackDialog feedbackDialog, Provider provider, C10486i c10486i) {
        Twig $r5 = LumberMill.getLogger();
        this.twig = $r5;
        this.style = styleType;
        this.rdns = feedbackDialog;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        StyleType $r4 = this.style;
        StyleType $r3 = StyleType.CHAT_FULL;
        if ($r4 != $r3) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String $r32 = str;
                    Uri $r42 = Uri.parse($r32);
                    Intent $r1 = new Intent("android.intent.action.VIEW", $r42);
                    $r1.setFlags(268435456);
                    ImageView $r5 = imageView;
                    Context $r6 = $r5.getContext();
                    IntentUtils.safelyOpenIntent($r6, $r1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getThumbnailUrlFromOembedResponse(io.intercom.okhttp3.Response r13) {
        /*
            r12 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            io.intercom.okhttp3.ResponseBody r2 = r13.body()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d org.json.JSONException -> L3b
            java.lang.String r3 = r2.string()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d org.json.JSONException -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d org.json.JSONException -> L3b
            io.intercom.okhttp3.ResponseBody r2 = r13.body()
            r2.close()
            r0 = r1
            goto L46
        L1b:
            r4 = move-exception
            goto L5a
        L1d:
            r5 = move-exception
            io.intercom.android.sdk.twig.Twig r6 = r12.twig     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r7.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = "Couldn't read response body: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L1b
            r7.append(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = "ErrorObject"
            r6.internal(r8, r3)     // Catch: java.lang.Throwable -> L1b
            goto L3f
        L3b:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L1b
        L3f:
            io.intercom.okhttp3.ResponseBody r2 = r13.body()
            r2.close()
        L46:
            java.lang.String r8 = "thumbnail_url"
            java.lang.String r3 = r0.optString(r8)
            java.lang.String r8 = "?image_crop_resized"
            int r10 = r3.indexOf(r8)
            if (r10 <= 0) goto L62
            r11 = 0
            java.lang.String r3 = r3.substring(r11, r10)
            return r3
        L5a:
            io.intercom.okhttp3.ResponseBody r2 = r13.body()
            r2.close()
            throw r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Video.getThumbnailUrlFromOembedResponse(io.intercom.okhttp3.Response):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r4 = viewGroup.getContext();
        Provider $r8 = this.appConfigProvider;
        StyleType $r3 = this.style;
        VideoPreviewView $r7 = new VideoPreviewView($r4, $r8, $r3);
        fetchThumbnail(videoProvider, str2, $r7);
        BlockUtils.setLayoutMarginsAndGravity($r7, 3, z2);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        C10486i $r3 = this.requestManager;
        videoPreviewView.displayThumbnail(str2, $r3);
        ImageView $r4 = videoPreviewView.getThumbnailImageView();
        addClickListenerOnThumbnailView($r4, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void fetchThumbnail(VideoProvider videoProvider, final String $r3, final VideoPreviewView videoPreviewView) {
        final ImageView $r4 = videoPreviewView.getThumbnailImageView();
        int[] $r5 = C101965.$SwitchMap$io$intercom$android$blocks$VideoProvider;
        int $i0 = $r5[videoProvider.ordinal()];
        if ($i0 == 1) {
            String $r7 = "https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/" + $r3;
            FeedbackDialog $r8 = this.rdns;
            $r8.getVideo($r7, new Callback() { // from class: io.intercom.android.sdk.blocks.Video.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    VideoPreviewView $r32 = videoPreviewView;
                    $r32.showFailedImage();
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    boolean $z0 = response.isSuccessful();
                    if (!$z0) {
                        VideoPreviewView $r9 = videoPreviewView;
                        $r9.showFailedImage();
                        return;
                    }
                    StringBuilder $r42 = new StringBuilder();
                    $r42.append("https://fast.wistia.net/embed/iframe/");
                    String $r52 = $r3;
                    $r42.append($r52);
                    final String $r53 = $r42.toString();
                    Video $r6 = Video.this;
                    final String $r72 = $r6.getThumbnailUrlFromOembedResponse(response);
                    ImageView $r82 = $r4;
                    $r82.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // java.lang.Runnable
                        public void run() {
                            C101891 $r43 = C101891.this;
                            Video $r1 = Video.this;
                            VideoPreviewView $r54 = videoPreviewView;
                            String $r2 = $r53;
                            String $r32 = $r72;
                            $r1.createThumbnail($r54, $r2, $r32);
                        }
                    });
                }
            });
        } else if ($i0 == 2) {
            String $r72 = "https://www.youtube.com/watch?v=" + $r3;
            createThumbnail(videoPreviewView, $r72, "https://img.youtube.com/vi/" + $r3 + "/default.jpg");
        } else if ($i0 == 3) {
            String $r73 = "https://vimeo.com/api/v2/video/" + $r3 + ".json";
            FeedbackDialog $r82 = this.rdns;
            $r82.getVideo($r73, new Callback() { // from class: io.intercom.android.sdk.blocks.Video.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    VideoPreviewView $r32 = videoPreviewView;
                    $r32.showFailedImage();
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    boolean $z0 = response.isSuccessful();
                    if ($z0) {
                        ResponseBody $r42 = response.body();
                        if ($r42 != null) {
                            try {
                                try {
                                    ResponseBody $r43 = response.body();
                                    String $r6 = $r43.string();
                                    JSONArray $r52 = new JSONArray($r6);
                                    JSONObject $r74 = $r52.getJSONObject(0);
                                    final String $r62 = $r74.getString("thumbnail_large");
                                    ImageView $r83 = $r4;
                                    $r83.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.2.1
                                        /* JADX WARN: Can't parse signature for local variable: 
                                        java.lang.NullPointerException
                                         */
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            C101912 $r32 = C101912.this;
                                            Video $r1 = Video.this;
                                            VideoPreviewView $r44 = videoPreviewView;
                                            StringBuilder $r53 = new StringBuilder();
                                            $r53.append("https://player.vimeo.com/video/");
                                            String $r2 = $r3;
                                            $r53.append($r2);
                                            String $r22 = $r53.toString();
                                            String $r63 = $r62;
                                            $r1.createThumbnail($r44, $r22, $r63);
                                        }
                                    });
                                } catch (IOException $r11) {
                                    Video $r12 = Video.this;
                                    Twig $r13 = $r12.twig;
                                    StringBuilder $r1 = new StringBuilder();
                                    $r1.append("Couldn't read response body: ");
                                    String $r63 = $r11.getMessage();
                                    $r1.append($r63);
                                    String $r64 = $r1.toString();
                                    $r13.internal("ErrorObject", $r64);
                                } catch (JSONException $r14) {
                                    $r14.printStackTrace();
                                }
                            } finally {
                                ResponseBody $r44 = response.body();
                                $r44.close();
                            }
                        }
                    }
                }
            });
        } else if ($i0 != 4) {
        } else {
            String $r74 = "https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/" + $r3;
            FeedbackDialog $r83 = this.rdns;
            $r83.getVideo($r74, new Callback() { // from class: io.intercom.android.sdk.blocks.Video.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    VideoPreviewView $r32 = videoPreviewView;
                    $r32.showFailedImage();
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    boolean $z0 = response.isSuccessful();
                    if (!$z0) {
                        VideoPreviewView $r9 = videoPreviewView;
                        $r9.showFailedImage();
                        return;
                    }
                    StringBuilder $r42 = new StringBuilder();
                    $r42.append("https://www.useloom.com/embed/");
                    String $r52 = $r3;
                    $r42.append($r52);
                    final String $r53 = $r42.toString();
                    Video $r6 = Video.this;
                    final String $r75 = $r6.getThumbnailUrlFromOembedResponse(response);
                    ImageView $r84 = $r4;
                    $r84.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.3.1
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // java.lang.Runnable
                        public void run() {
                            C101933 $r43 = C101933.this;
                            Video $r1 = Video.this;
                            VideoPreviewView $r54 = videoPreviewView;
                            String $r2 = $r53;
                            String $r32 = $r75;
                            $r1.createThumbnail($r54, $r2, $r32);
                        }
                    });
                }
            });
        }
    }
}
