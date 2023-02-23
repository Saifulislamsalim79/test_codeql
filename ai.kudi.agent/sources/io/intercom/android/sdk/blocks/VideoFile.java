package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomVideoActivity;
import io.intercom.android.sdk.blocks.blockInterfaces.VideoFileBlock;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes.dex */
public class VideoFile implements VideoFileBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final MetricTracker metricTracker;
    private final C10486i requestManager;
    private final StyleType style;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoFile(StyleType styleType, Provider provider, C10486i c10486i, MetricTracker metricTracker) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        this.metricTracker = metricTracker;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        StyleType $r4 = this.style;
        StyleType $r3 = StyleType.CHAT_FULL;
        if ($r4 != $r3) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.VideoFile.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    VideoFile $r2 = VideoFile.this;
                    MetricTracker $r32 = $r2.metricTracker;
                    $r32.startedToPlayVideo();
                    ImageView $r42 = imageView;
                    Context $r5 = $r42.getContext();
                    int $i0 = Build.VERSION.SDK_INT;
                    if ($i0 >= 19) {
                        String $r6 = str;
                        Intent $r7 = IntercomVideoActivity.buildIntent($r5, $r6);
                        $r5.startActivity($r7);
                        return;
                    }
                    String $r62 = str;
                    Uri $r8 = Uri.parse($r62);
                    Intent $r72 = new Intent("android.intent.action.VIEW", $r8);
                    $r5.startActivity($r72);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View textFallback(String str, ViewGroup viewGroup) {
        Context $r6 = viewGroup.getContext();
        StyleType $r2 = StyleType.ADMIN;
        BlockAlignment $r3 = BlockAlignment.LEFT;
        Provider $r7 = this.appConfigProvider;
        Object $r8 = $r7.get();
        AppConfig $r9 = (AppConfig) $r8;
        View r11 = new ParagraphView($r6, $r2, $r3, $r9);
        CharSequence $r10 = HtmlCompat.fromHtml(str);
        TextView r12 = (TextView) r11;
        r12.setText($r10);
        View r13 = r11;
        return r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.VideoFileBlock
    public View addVideoFile(String str, String str2, String str3, boolean z, boolean z2, ViewGroup viewGroup) {
        boolean $z0 = TextUtils.isEmpty(str2);
        if ($z0) {
            View $r5 = textFallback(str, viewGroup);
            return $r5;
        }
        Context $r7 = viewGroup.getContext();
        Provider $r8 = this.appConfigProvider;
        StyleType $r9 = this.style;
        VideoPreviewView $r6 = new VideoPreviewView($r7, $r8, $r9);
        ImageView $r10 = $r6.getThumbnailImageView();
        C10486i $r11 = this.requestManager;
        $r6.displayThumbnail(str3, $r11);
        addClickListenerOnThumbnailView($r10, str2);
        return $r6;
    }
}
