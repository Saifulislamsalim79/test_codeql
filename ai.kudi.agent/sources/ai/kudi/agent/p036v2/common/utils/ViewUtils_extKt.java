package ai.kudi.agent.p036v2.common.utils;

import android.app.Activity;
import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.C2832e;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11773r;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ViewUtils.ext.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001av\u0010\u000f\u001a\u00020\u000b*\u00020\u00102(\b\u0002\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122(\b\u0002\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¨\u0006\u0016"}, m10421d2 = {"getInfiniteScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "currentPage", "", "lastPage", "visibleItemThreshold", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "nextPage", "", "isGooglePlayServicesAvailable", "", "Landroid/app/Activity;", "textChanges", "Landroid/widget/EditText;", "beforeTextChanged", "Lkotlin/Function4;", "", "onTextChanged", "afterTextChanged", "feature-collections_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.ViewUtils_extKt */
/* loaded from: classes.dex */
public final class ViewUtils_extKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final RecyclerView.AbstractC1644u getInfiniteScrollListener(int i, int i2, int i3, InterfaceC11767l interfaceC11767l) {
        return new InfiniteRecyclerViewOnScrollListener(i, i2, i3) { // from class: ai.kudi.agent.v2.common.utils.ViewUtils_extKt$getInfiniteScrollListener$1
            final /* synthetic */ int $currentPage;
            final /* synthetic */ int $lastPage;
            final /* synthetic */ int $visibleItemThreshold;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i, i2, i3);
                this.$currentPage = i;
                this.$lastPage = i2;
                this.$visibleItemThreshold = i3;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.InfiniteRecyclerViewOnScrollListener
            public void onLoadMore(int i4) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                if ($r1 == null) {
                    return;
                }
                Integer $r2 = Integer.valueOf(i4);
                $r1.invoke($r2);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ RecyclerView.AbstractC1644u getInfiniteScrollListener$default(int $i0, int $i1, int $i2, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i4 = i & 1;
        if ($i4 != 0) {
            $i0 = 0;
        }
        int $i42 = i & 2;
        if ($i42 != 0) {
            $i1 = -1;
        }
        int $i3 = i & 4;
        if ($i3 != 0) {
            $i2 = 3;
        }
        RecyclerView.AbstractC1644u $r1 = getInfiniteScrollListener($i0, $i1, $i2, interfaceC11767l);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean isGooglePlayServicesAvailable(Activity activity) {
        Log_OC.getArray(activity, "<this>");
        C2832e $r1 = C2832e.m31864o();
        Log_OC.loadImage($r1, "getInstance()");
        int $i0 = $r1.mo31846g(activity);
        if ($i0 != 0) {
            boolean $z0 = $r1.mo31843j($i0);
            if ($z0) {
                Dialog $r2 = $r1.m31867l(activity, $i0, 2404);
                Log_OC.append($r2);
                $r2.setCancelable(false);
                boolean $z02 = $r2.isShowing();
                if (!$z02) {
                    $r2.show();
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void textChanges(EditText editText, final InterfaceC11773r interfaceC11773r, final InterfaceC11773r interfaceC11773r2, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(editText, "<this>");
        editText.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.v2.common.utils.ViewUtils_extKt$textChanges$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                InterfaceC11767l $r1 = interfaceC11767l;
                if ($r1 == null) {
                    return;
                }
                String $r2 = String.valueOf(editable);
                $r1.invoke($r2);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                InterfaceC11773r $r1 = InterfaceC11773r.this;
                if ($r1 == null) {
                    return;
                }
                String $r3 = String.valueOf(charSequence);
                Integer $r4 = Integer.valueOf(i);
                Integer $r5 = Integer.valueOf(i2);
                Integer $r6 = Integer.valueOf(i3);
                $r1.invoke($r3, $r4, $r5, $r6);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                InterfaceC11773r $r1 = interfaceC11773r2;
                if ($r1 == null) {
                    return;
                }
                String $r3 = String.valueOf(charSequence);
                Integer $r4 = Integer.valueOf(i);
                Integer $r5 = Integer.valueOf(i2);
                Integer $r6 = Integer.valueOf(i3);
                $r1.invoke($r3, $r4, $r5, $r6);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void textChanges$default(EditText editText, InterfaceC11773r $r1, InterfaceC11773r $r2, InterfaceC11767l $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = null;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = null;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r3 = null;
        }
        textChanges(editText, $r1, $r2, $r3);
    }
}
