package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SettingsOptionsItemBinding implements InterfaceC8209a {
    public final ImageView imageView13;
    private final ConstraintLayout rootView;
    public final ImageView settingsIcon;
    public final KudiTextView settingsName;
    public final FrameLayout settingsOptionsImage;
    public final AppCompatTextView updateAppTextView;

    private SettingsOptionsItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, KudiTextView kudiTextView, FrameLayout frameLayout, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.imageView13 = imageView;
        this.settingsIcon = imageView2;
        this.settingsName = kudiTextView;
        this.settingsOptionsImage = frameLayout;
        this.updateAppTextView = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SettingsOptionsItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.imageView13;
        View $r1 = view.findViewById(C0001R.C0003id.imageView13);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.settings_icon;
            View $r12 = view.findViewById(C0001R.C0003id.settings_icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.settingsName;
                View $r13 = view.findViewById(C0001R.C0003id.settingsName);
                KudiTextView $r4 = (KudiTextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.settings_options_image;
                    View $r14 = view.findViewById(C0001R.C0003id.settings_options_image);
                    FrameLayout frameLayout = (FrameLayout) $r14;
                    if (frameLayout != null) {
                        $i0 = C0001R.C0003id.updateAppTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.updateAppTextView);
                        AppCompatTextView appCompatTextView = (AppCompatTextView) $r15;
                        if (appCompatTextView != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            SettingsOptionsItemBinding $r7 = new SettingsOptionsItemBinding($r8, $r2, $r3, $r4, frameLayout, appCompatTextView);
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
    public static SettingsOptionsItemBinding inflate(LayoutInflater layoutInflater) {
        SettingsOptionsItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SettingsOptionsItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.settings_options_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SettingsOptionsItemBinding $r3 = bind($r2);
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
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
