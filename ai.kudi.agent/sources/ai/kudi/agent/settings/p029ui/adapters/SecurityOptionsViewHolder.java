package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.SecurityItemsLayoutBinding;
import ai.kudi.agent.settings.data.SecurityOption;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SecurityOptionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/SecurityOptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/SecurityItemsLayoutBinding;", "(Lai/kudi/agent/databinding/SecurityItemsLayoutBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/SecurityItemsLayoutBinding;", "setData", "", "securityOption", "Lai/kudi/agent/settings/data/SecurityOption;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.SecurityOptionsViewHolder */
/* loaded from: classes.dex */
public final class SecurityOptionsViewHolder extends RecyclerView.AbstractC1620e0 {
    private final SecurityItemsLayoutBinding binding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SecurityOptionsViewHolder(ai.kudi.agent.databinding.SecurityItemsLayoutBinding r5) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.getRoot()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r2 = r3
            r4.<init>(r2)
            r4.binding = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.SecurityOptionsViewHolder.<init>(ai.kudi.agent.databinding.SecurityItemsLayoutBinding):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SecurityItemsLayoutBinding getBinding() {
        SecurityItemsLayoutBinding r1 = this.binding;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(SecurityOption securityOption) {
        Log_OC.getArray(securityOption, "securityOption");
        SecurityItemsLayoutBinding $r2 = this.binding;
        TextView $r3 = $r2.securityOptionTextView;
        CharSequence $r4 = securityOption.getTitle();
        TextView r5 = $r3;
        r5.setText($r4);
        SecurityItemsLayoutBinding $r22 = this.binding;
        TextView $r32 = $r22.securityOptionTextView;
        Log_OC.loadImage($r32, "binding.securityOptionTextView");
        int $i0 = securityOption.getIcon();
        TextView r52 = $r32;
        ViewExtKt.setCompoundKudiDrawables$default(r52, $i0, 0, 0, 0, 0, 30, null);
    }
}
