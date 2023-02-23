package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class MyDevicesItemBinding implements InterfaceC8209a {
    public final TextView deleteView;
    public final KudiTextView deviceNameView;
    public final ImageView imageView9;
    public final KudiTextView lastLoginTimeText;
    private final CardView rootView;
    public final View view9;

    private MyDevicesItemBinding(CardView cardView, TextView textView, KudiTextView kudiTextView, ImageView imageView, KudiTextView kudiTextView2, View view) {
        this.rootView = cardView;
        this.deleteView = textView;
        this.deviceNameView = kudiTextView;
        this.imageView9 = imageView;
        this.lastLoginTimeText = kudiTextView2;
        this.view9 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MyDevicesItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.deleteView;
        View $r1 = view.findViewById(C0001R.C0003id.deleteView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.deviceNameView;
            View $r12 = view.findViewById(C0001R.C0003id.deviceNameView);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.imageView9;
                View $r13 = view.findViewById(C0001R.C0003id.imageView9);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.last_login_time_text;
                    View $r14 = view.findViewById(C0001R.C0003id.last_login_time_text);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.view9;
                        View $r15 = view.findViewById(C0001R.C0003id.view9);
                        if ($r15 != null) {
                            MyDevicesItemBinding $r6 = new MyDevicesItemBinding((CardView) view, $r2, $r3, $r4, kudiTextView, $r15);
                            return $r6;
                        }
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MyDevicesItemBinding inflate(LayoutInflater layoutInflater) {
        MyDevicesItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MyDevicesItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.my_devices_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        MyDevicesItemBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
