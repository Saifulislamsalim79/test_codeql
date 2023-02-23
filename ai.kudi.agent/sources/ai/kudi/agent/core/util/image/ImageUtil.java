package ai.kudi.agent.core.util.image;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.core.content.C1335a;
import com.squareup.picasso.C7360t;
import com.squareup.picasso.C7376x;
import com.squareup.picasso.InterfaceC7336e;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ImageUtil.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/core/util/image/ImageUtil;", "", "()V", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ImageUtil {
    public static final Companion Companion;

    /* compiled from: ImageUtil.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/core/util/image/ImageUtil$Companion;", "", "()V", "getRemotePathImageId", "", "imageId", "imageCallback", "Lcom/squareup/picasso/Callback;", "load", "", "context", "Landroid/content/Context;", "path", "Landroid/net/Uri;", "image", "Landroid/widget/ImageView;", "placeHolder", "", "errorPlaceHolder", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final InterfaceC7336e imageCallback() {
            return new InterfaceC7336e() { // from class: ai.kudi.agent.core.util.image.ImageUtil$Companion$imageCallback$1
                @Override // com.squareup.picasso.InterfaceC7336e
                public void onError(Exception exc) {
                    if (exc == null) {
                        return;
                    }
                    exc.printStackTrace();
                }

                @Override // com.squareup.picasso.InterfaceC7336e
                public void onSuccess() {
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void load$default(Companion companion, Context context, Uri uri, ImageView imageView, int $i2, int $i0, int i, Object obj) {
            int $i3 = i & 8;
            if ($i3 != 0) {
                $i2 = 17170445;
            }
            int $i1 = i & 16;
            if ($i1 != 0) {
                $i0 = 17170445;
            }
            companion.load(context, uri, imageView, $i2, $i0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void load$default(Companion companion, Context context, String str, ImageView imageView, int $i2, int $i0, int i, Object obj) {
            int $i3 = i & 8;
            if ($i3 != 0) {
                $i2 = 17170445;
            }
            int $i1 = i & 16;
            if ($i1 != 0) {
                $i0 = 17170445;
            }
            companion.load(context, str, imageView, $i2, $i0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getRemotePathImageId(String str) {
            String $r2 = "https://app-service.kudi.ai/images/" + ((Object) str) + "?size=orig";
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void load(Context context, Uri uri, ImageView imageView, int i, int i2) {
            Log_OC.getArray(context, "context");
            Log_OC.getArray(imageView, "image");
            Drawable $r4 = C1335a.m36322f(context, i);
            Drawable $r5 = C1335a.m36322f(context, i2);
            if (uri == null) {
                imageView.setImageResource(i2);
                return;
            }
            C7360t $r6 = C7360t.m18881g();
            C7376x $r7 = $r6.m18879i(uri);
            Log_OC.append($r4);
            $r7.m18845g($r4);
            Log_OC.append($r5);
            $r7.m18849c($r5);
            InterfaceC7336e $r8 = imageCallback();
            $r7.m18846f(imageView, $r8);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void load(android.content.Context r6, java.lang.String r7, android.widget.ImageView r8) {
            /*
                r5 = this;
                java.lang.String r0 = "context"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                java.lang.String r0 = "image"
                kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
                if (r7 == 0) goto L15
                boolean r1 = kotlin.p549l0.C13265j.m5470u(r7)
                if (r1 == 0) goto L13
                goto L15
            L13:
                r1 = 0
                goto L16
            L15:
                r1 = 1
            L16:
                if (r1 != 0) goto L27
                com.squareup.picasso.t r2 = com.squareup.picasso.C7360t.m18881g()
                com.squareup.picasso.x r3 = r2.m18878j(r7)
                com.squareup.picasso.e r4 = r5.imageCallback()
                r3.m18846f(r8, r4)
            L27:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.image.ImageUtil.Companion.load(android.content.Context, java.lang.String, android.widget.ImageView):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void load(android.content.Context r8, java.lang.String r9, android.widget.ImageView r10, int r11, int r12) {
            /*
                r7 = this;
                java.lang.String r0 = "context"
                kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
                java.lang.String r0 = "image"
                kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
                android.graphics.drawable.Drawable r1 = androidx.core.content.C1335a.m36322f(r8, r11)
                android.graphics.drawable.Drawable r2 = androidx.core.content.C1335a.m36322f(r8, r12)
                if (r9 == 0) goto L1d
                boolean r3 = kotlin.p549l0.C13265j.m5470u(r9)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                goto L1e
            L1d:
                r3 = 1
            L1e:
                if (r3 != 0) goto L3c
                com.squareup.picasso.t r4 = com.squareup.picasso.C7360t.m18881g()
                com.squareup.picasso.x r5 = r4.m18878j(r9)
                kotlin.p483e0.p485d.Log_OC.append(r1)
                r5.m18845g(r1)
                kotlin.p483e0.p485d.Log_OC.append(r2)
                r5.m18849c(r2)
                com.squareup.picasso.e r6 = r7.imageCallback()
                r5.m18846f(r10, r6)
                return
            L3c:
                r10.setImageResource(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.image.ImageUtil.Companion.load(android.content.Context, java.lang.String, android.widget.ImageView, int, int):void");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }
}
