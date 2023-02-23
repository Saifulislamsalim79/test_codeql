package ai.kudi.agent.core.viewBinding;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BaseViewBinder.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "VB", "Landroidx/viewbinding/ViewBinding;", "", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/viewbinding/ViewBinding;Landroidx/fragment/app/Fragment;)Landroid/view/View;", "requireBinding", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BaseViewBinder<VB extends InterfaceC8209a> {
    InterfaceC8209a getBinding();

    View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment);

    InterfaceC8209a requireBinding();
}
