package ai.kudi.agent.common_screens.status_loader;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.DialogFragmentKudiStatusLoaderBinding;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import java.io.Serializable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KudiStatusLoaderDialogFragment.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003$%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J&\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020\u0003H\u0096\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/DialogFragmentKudiStatusLoaderBinding;", "()V", "actionListener", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$ActionListener;", "binding", "getBinding", "()Lai/kudi/agent/databinding/DialogFragmentKudiStatusLoaderBinding;", "option", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$Option;", "close", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "open", "fm", "Landroidx/fragment/app/FragmentManager;", "requireBinding", "ActionListener", "Companion", "Option", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KudiStatusLoaderDialogFragment extends h implements BaseViewBinder<DialogFragmentKudiStatusLoaderBinding> {
    public static final Companion Companion;
    private static final String KEY_ACTION_LISTENER = "key_action_listener";
    private static final String KEY_OPTION = "key_action";
    private final /* synthetic */ BaseViewBinderImpl<DialogFragmentKudiStatusLoaderBinding> $$delegate_0;
    private ActionListener actionListener;
    private Option option;

    /* compiled from: KudiStatusLoaderDialogFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$ActionListener;", "Ljava/io/Serializable;", "onDismissDialog", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface ActionListener extends Serializable {
        void onDismissDialog();
    }

    /* compiled from: KudiStatusLoaderDialogFragment.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$Companion;", "", "()V", "KEY_ACTION_LISTENER", "", "KEY_OPTION", "create", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment;", "option", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$Option;", "actionListener", "Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$ActionListener;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final KudiStatusLoaderDialogFragment create(Option option, ActionListener actionListener) {
            Log_OC.getArray(option, "option");
            Log_OC.getArray(actionListener, "actionListener");
            KudiStatusLoaderDialogFragment $r3 = new KudiStatusLoaderDialogFragment(null);
            Bundle $r4 = new Bundle();
            $r4.putSerializable(KudiStatusLoaderDialogFragment.KEY_ACTION_LISTENER, actionListener);
            $r4.putParcelable(KudiStatusLoaderDialogFragment.KEY_OPTION, option);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* compiled from: KudiStatusLoaderDialogFragment.kt */
    @Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/common_screens/status_loader/KudiStatusLoaderDialogFragment$Option;", "Landroid/os/Parcelable;", "titleText", "", "messageText", "textColor", "", "bgColor", "(Ljava/lang/String;Ljava/lang/String;II)V", "getBgColor", "()I", "getMessageText", "()Ljava/lang/String;", "getTextColor", "getTitleText", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Option implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR;
        private final int bgColor;
        private final String messageText;
        private final int textColor;
        private final String titleText;

        /* compiled from: KudiStatusLoaderDialogFragment.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Option> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                String $r3 = parcel.readString();
                String $r4 = parcel.readString();
                int $i0 = parcel.readInt();
                int $i1 = parcel.readInt();
                Option $r2 = new Option($r3, $r4, $i0, $i1);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Option createFromParcel(Parcel parcel) {
                Option $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i) {
                Option[] $r1 = new Option[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Option[] newArray(int i) {
                Option[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Creator $r0 = new Creator();
            CREATOR = $r0;
        }

        public Option(String str, String str2, int i, int i2) {
            Log_OC.getArray(str2, "messageText");
            this.titleText = str;
            this.messageText = str2;
            this.textColor = i;
            this.bgColor = i2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Option(java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
            /*
                r1 = this;
                r0 = r6 & 1
                if (r0 == 0) goto L5
                r2 = 0
            L5:
                r0 = r6 & 4
                if (r0 == 0) goto Lc
                r4 = 2131099699(0x7f060033, float:1.7811759E38)
            Lc:
                r6 = r6 & 8
                if (r6 == 0) goto L13
                r5 = 2131100136(0x7f0601e8, float:1.7812645E38)
            L13:
                r1.<init>(r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.common_screens.status_loader.KudiStatusLoaderDialogFragment.Option.<init>(java.lang.String, java.lang.String, int, int, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Option copy$default(Option option, String $r1, String $r2, int $i0, int $i1, int i, Object obj) {
            int $i3 = i & 1;
            if ($i3 != 0) {
                $r1 = option.titleText;
            }
            int $i32 = i & 2;
            if ($i32 != 0) {
                $r2 = option.messageText;
            }
            int $i33 = i & 4;
            if ($i33 != 0) {
                $i0 = option.textColor;
            }
            int $i2 = i & 8;
            if ($i2 != 0) {
                $i1 = option.bgColor;
            }
            Option $r0 = option.copy($r1, $r2, $i0, $i1);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.titleText;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.messageText;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component3() {
            int i0 = this.textColor;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component4() {
            int i0 = this.bgColor;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Option copy(String str, String str2, int i, int i2) {
            Log_OC.getArray(str2, "messageText");
            Option $r0 = new Option(str, str2, i, i2);
            return $r0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Option;
            if ($z0) {
                Option $r2 = (Option) obj;
                String $r3 = this.titleText;
                String $r4 = $r2.titleText;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.messageText;
                    String $r42 = $r2.messageText;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        int $i0 = this.textColor;
                        int $i1 = $r2.textColor;
                        if ($i0 != $i1) {
                            return false;
                        }
                        int $i02 = this.bgColor;
                        int $i12 = $r2.bgColor;
                        return $i02 == $i12;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getBgColor() {
            int i0 = this.bgColor;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getMessageText() {
            String r1 = this.messageText;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getTextColor() {
            int i0 = this.textColor;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getTitleText() {
            String r1 = this.titleText;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.titleText;
            int $i0 = $r1 == null ? 0 : $r1.hashCode();
            int $i1 = this.messageText.hashCode();
            int $i12 = this.textColor;
            int $i13 = this.bgColor;
            return ((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Option(titleText=");
            String $r1 = this.titleText;
            $r2.append((Object) $r1);
            $r2.append(", messageText=");
            String $r12 = this.messageText;
            $r2.append($r12);
            $r2.append(", textColor=");
            int $i0 = this.textColor;
            $r2.append($i0);
            $r2.append(", bgColor=");
            int $i02 = this.bgColor;
            $r2.append($i02);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            String $r2 = this.titleText;
            parcel.writeString($r2);
            String $r22 = this.messageText;
            parcel.writeString($r22);
            int $i0 = this.textColor;
            parcel.writeInt($i0);
            int $i02 = this.bgColor;
            parcel.writeInt($i02);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private KudiStatusLoaderDialogFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    public /* synthetic */ KudiStatusLoaderDialogFragment(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        boolean $z0 = isVisible();
        if ($z0) {
            dismiss();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public DialogFragmentKudiStatusLoaderBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        DialogFragmentKudiStatusLoaderBinding $r3 = (DialogFragmentKudiStatusLoaderBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        DialogFragmentKudiStatusLoaderBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(DialogFragmentKudiStatusLoaderBinding dialogFragmentKudiStatusLoaderBinding, Fragment fragment) {
        Log_OC.getArray(dialogFragmentKudiStatusLoaderBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(dialogFragmentKudiStatusLoaderBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        DialogFragmentKudiStatusLoaderBinding $r4 = (DialogFragmentKudiStatusLoaderBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Dialog onCreateDialog(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.common_screens.status_loader.KudiStatusLoaderDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        DialogFragmentKudiStatusLoaderBinding $r4 = DialogFragmentKudiStatusLoaderBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDismiss(DialogInterface dialogInterface) {
        Log_OC.getArray(dialogInterface, "dialog");
        ActionListener $r2 = this.actionListener;
        if ($r2 != null) {
            $r2.onDismissDialog();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        DialogFragmentKudiStatusLoaderBinding $r3 = requireBinding();
        TextView $r4 = $r3.tvMsg;
        Log_OC.loadImage($r4, "requireBinding().tvMsg");
        DialogFragmentKudiStatusLoaderBinding $r32 = requireBinding();
        ViewGroup $r5 = $r32.container;
        Log_OC.loadImage($r5, "requireBinding().container");
        Option $r6 = this.option;
        Log_OC.append($r6);
        String $r7 = $r6.getMessageText();
        $r4.setText($r7);
        Context $r8 = requireContext();
        Option $r62 = this.option;
        Log_OC.append($r62);
        int $i0 = $r62.getTextColor();
        $r4.setTextColor(C1335a.m36324d($r8, $i0));
        Context $r82 = requireContext();
        Option $r63 = this.option;
        Log_OC.append($r63);
        int $i02 = $r63.getBgColor();
        ViewGroup r9 = $r5;
        r9.setBackgroundColor(C1335a.m36324d($r82, $i02));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void open(FragmentManager fragmentManager) {
        Log_OC.getArray(fragmentManager, "fm");
        close();
        String $r2 = KudiStatusLoaderDialogFragment.class.getSimpleName();
        show(fragmentManager, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public DialogFragmentKudiStatusLoaderBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        DialogFragmentKudiStatusLoaderBinding $r3 = (DialogFragmentKudiStatusLoaderBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        DialogFragmentKudiStatusLoaderBinding $r1 = requireBinding();
        return $r1;
    }
}
