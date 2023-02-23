package p198f.p199a.objectweb.asm.commons;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p198f.p199a.objectweb.asm.R$id;
import p198f.p199a.objectweb.asm.R$layout;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ActivityForceUpdateBinding.java */
/* renamed from: f.a.objectweb.asm.commons.b */
/* loaded from: classes.dex */
public final class C7445b implements InterfaceC8209a {

    /* renamed from: a */
    public final TextView f17662a;

    /* renamed from: b */
    public final TextView f17663b;

    /* renamed from: c */
    public final Button f17664c;

    /* renamed from: h */
    private final ConstraintLayout f17665h;

    private C7445b(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, Button button, TextView textView2, TextView textView3) {
        this.f17665h = constraintLayout;
        this.f17663b = textView;
        this.f17664c = button;
        this.f17662a = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static C7445b m18702a(LayoutInflater layoutInflater) {
        C7445b $r0 = m18701a(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static C7445b m18701a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.activity_force_update;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        C7445b $r3 = onCreateView($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C7445b onCreateView(View view) {
        int $i0 = R$id.exitAppTextView;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.imageView;
            View $r12 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = R$id.updateButton;
                View $r13 = view.findViewById($i0);
                Button $r4 = (Button) $r13;
                if ($r4 != null) {
                    $i0 = R$id.updateInstructionsTextView;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = R$id.versionNumberTextView;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            C7445b $r7 = new C7445b((ConstraintLayout) view, $r2, $r3, $r4, textView, textView2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public ConstraintLayout m18703a() {
        ConstraintLayout r1 = this.f17665h;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = m18703a();
        View r2 = $r1;
        return r2;
    }
}
