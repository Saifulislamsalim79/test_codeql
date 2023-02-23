package ai.kudi.agent.core.util;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.C7360t;
import com.squareup.picasso.C7376x;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ImageViewExt.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a&\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m10421d2 = {"load", "", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "path", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "setTint", "coloRes", "", "hasVectorDrawable", "", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ImageViewExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void load(ImageView imageView, Context context, String str) {
        Log_OC.getArray(imageView, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "path");
        C7360t $r3 = C7360t.m18881g();
        C7376x $r4 = $r3.m18878j(str);
        $r4.m18847e(imageView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void load(ImageView imageView, Context context, String str, Drawable drawable, Drawable drawable2) {
        Log_OC.getArray(imageView, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(drawable, "placeholder");
        Log_OC.getArray(drawable2, "errorDrawable");
        C7360t $r5 = C7360t.m18881g();
        C7376x $r6 = $r5.m18878j(str);
        $r6.m18845g(drawable);
        $r6.m18849c(drawable2);
        $r6.m18847e(imageView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setTint(ImageView imageView, Context context, int i, boolean z) {
        Log_OC.getArray(imageView, "<this>");
        Log_OC.getArray(context, "context");
        int $i0 = ContextExtKt.getKudiColor(context, i);
        PorterDuff.Mode $r2 = !z ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter($i0, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setTint$default(ImageView imageView, Context context, int i, boolean $z0, int i2, Object obj) {
        int $i1 = i2 & 4;
        if ($i1 != 0) {
            $z0 = true;
        }
        setTint(imageView, context, i, $z0);
    }
}
