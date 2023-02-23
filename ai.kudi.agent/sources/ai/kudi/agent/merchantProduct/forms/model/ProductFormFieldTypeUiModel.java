package ai.kudi.agent.merchantProduct.forms.model;

import ai.kudi.agent.merchantProduct.forms.DateInputFieldView;
import ai.kudi.agent.merchantProduct.forms.LongTextInputFieldView;
import ai.kudi.agent.merchantProduct.forms.MoneyInputFieldView;
import ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView;
import android.content.Context;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductFormFieldTypeUiModel.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0013\u0014\u0015\u0016\u0017\u0018B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "inputValue", "getInputValue", "()Z", "isValid", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "Date", "Email", "LongText", "Money", "Number", "ShortText", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$ShortText;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Number;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Email;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Date;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Money;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$LongText;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProductFormFieldTypeUiModel {
    private final String fieldHint;
    private final String fieldLabel;
    private final boolean isFieldRequired;

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Date;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/DateInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Date extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private DateInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Date(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Date copy$default(Date date, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = date.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = date.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = date.getFieldHint();
            }
            Date $r0 = date.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Date copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            Date $r0 = new Date(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Date;
            if ($z0) {
                Date $r2 = (Date) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            DateInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            DateInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            DateInputFieldView $r2 = new DateInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            $r2.setRequired($z0);
            String $r3 = getFieldLabel();
            $r2.setLabel($r3);
            String $r32 = getFieldLabel();
            $r2.setHint($r32);
            C13666w c13666w = C13666w.f30112a;
            this.formField = $r2;
            if ($r2 != null) {
                return $r2;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException $r5 = new IllegalArgumentException($r33);
            throw $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("Date(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Email;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/ShortTextInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Email extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private ShortTextInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Email copy$default(Email email, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = email.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = email.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = email.getFieldHint();
            }
            Email $r0 = email.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Email copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            Email $r0 = new Email(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Email;
            if ($z0) {
                Email $r2 = (Email) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            ShortTextInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            ShortTextInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            ShortTextInputFieldView r6 = new ShortTextInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            r6.setRequired($z0);
            String $r3 = getFieldLabel();
            r6.setLabel($r3);
            String $r32 = getFieldLabel();
            r6.setInputHint($r32);
            r6.setInputType(2);
            C13666w c13666w = C13666w.f30112a;
            this.formField = r6;
            if (r6 != null) {
                return r6;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException r7 = new IllegalArgumentException($r33);
            throw r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("Email(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$LongText;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/LongTextInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LongText extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private LongTextInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LongText(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ LongText copy$default(LongText longText, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = longText.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = longText.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = longText.getFieldHint();
            }
            LongText $r0 = longText.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final LongText copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            LongText $r0 = new LongText(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof LongText;
            if ($z0) {
                LongText $r2 = (LongText) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            LongTextInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            LongTextInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            LongTextInputFieldView r6 = new LongTextInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            r6.setRequired($z0);
            String $r3 = getFieldLabel();
            r6.setLabel($r3);
            String $r32 = getFieldLabel();
            r6.setInputHint($r32);
            r6.setInputType(5);
            C13666w c13666w = C13666w.f30112a;
            this.formField = r6;
            if (r6 != null) {
                return r6;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException r7 = new IllegalArgumentException($r33);
            throw r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("LongText(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Money;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/MoneyInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Money extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private MoneyInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Money(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Money copy$default(Money money, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = money.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = money.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = money.getFieldHint();
            }
            Money $r0 = money.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Money copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            Money $r0 = new Money(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Money;
            if ($z0) {
                Money $r2 = (Money) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            MoneyInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            MoneyInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            MoneyInputFieldView r6 = new MoneyInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            r6.setRequired($z0);
            String $r3 = getFieldLabel();
            r6.setLabel($r3);
            String $r32 = getFieldLabel();
            r6.setInputHint($r32);
            r6.setInputType(6);
            C13666w c13666w = C13666w.f30112a;
            this.formField = r6;
            if (r6 != null) {
                return r6;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException r7 = new IllegalArgumentException($r33);
            throw r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("Money(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$Number;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/ShortTextInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Number extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private ShortTextInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Number(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Number copy$default(Number number, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = number.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = number.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = number.getFieldHint();
            }
            Number $r0 = number.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Number copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            Number $r0 = new Number(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Number;
            if ($z0) {
                Number $r2 = (Number) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            ShortTextInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            ShortTextInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            ShortTextInputFieldView r6 = new ShortTextInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            r6.setRequired($z0);
            String $r3 = getFieldLabel();
            r6.setLabel($r3);
            String $r32 = getFieldLabel();
            r6.setInputHint($r32);
            r6.setInputType(1);
            C13666w c13666w = C13666w.f30112a;
            this.formField = r6;
            if (r6 != null) {
                return r6;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException r7 = new IllegalArgumentException($r33);
            throw r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("Number(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    /* compiled from: ProductFormFieldTypeUiModel.kt */
    @Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel$ShortText;", "Lai/kudi/agent/merchantProduct/forms/model/ProductFormFieldTypeUiModel;", "isFieldRequired", "", "fieldLabel", "", "fieldHint", "(ZLjava/lang/String;Ljava/lang/String;)V", "getFieldHint", "()Ljava/lang/String;", "getFieldLabel", "formField", "Lai/kudi/agent/merchantProduct/forms/ShortTextInputFieldView;", "inputValue", "getInputValue", "()Z", "isValid", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "makeFormField", "Landroid/view/View;", "context", "Landroid/content/Context;", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ShortText extends ProductFormFieldTypeUiModel {
        private final String fieldHint;
        private final String fieldLabel;
        private ShortTextInputFieldView formField;
        private final boolean isFieldRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShortText(boolean z, String str, String str2) {
            super(z, str, str2, null);
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            this.isFieldRequired = z;
            this.fieldLabel = str;
            this.fieldHint = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ ShortText copy$default(ShortText shortText, boolean $z0, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $z0 = shortText.isFieldRequired();
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r1 = shortText.getFieldLabel();
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r2 = shortText.getFieldHint();
            }
            ShortText $r0 = shortText.copy($z0, $r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean $z0 = isFieldRequired();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String $r1 = getFieldLabel();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String $r1 = getFieldHint();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ShortText copy(boolean z, String str, String str2) {
            Log_OC.getArray(str, "fieldLabel");
            Log_OC.getArray(str2, "fieldHint");
            ShortText $r0 = new ShortText(z, str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof ShortText;
            if ($z0) {
                ShortText $r2 = (ShortText) obj;
                boolean $z02 = isFieldRequired();
                boolean $z1 = $r2.isFieldRequired();
                if ($z02 != $z1) {
                    return false;
                }
                String $r3 = getFieldLabel();
                String $r4 = $r2.getFieldLabel();
                boolean $z03 = Log_OC.append($r3, $r4);
                if ($z03) {
                    String $r32 = getFieldHint();
                    String $r42 = $r2.getFieldHint();
                    boolean $z04 = Log_OC.append($r32, $r42);
                    return $z04;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldHint() {
            String r1 = this.fieldHint;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getFieldLabel() {
            String r1 = this.fieldLabel;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public String getInputValue() {
            ShortTextInputFieldView $r2 = this.formField;
            String $r1 = $r2 == null ? null : $r2.getText();
            return $r1 != null ? $r1 : "";
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = isFieldRequired();
            boolean $z1 = $z0;
            if ($z0) {
                $z1 = true;
            }
            int $i0 = $z1;
            String $r1 = getFieldLabel();
            int $i1 = $r1.hashCode();
            String $r12 = getFieldHint();
            int $i12 = $r12.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isFieldRequired() {
            boolean z0 = this.isFieldRequired;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public boolean isValid() {
            ShortTextInputFieldView $r1 = this.formField;
            if ($r1 == null) {
                return false;
            }
            boolean $z0 = $r1.validate();
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.merchantProduct.forms.model.ProductFormFieldTypeUiModel
        public View makeFormField(Context context) {
            Log_OC.getArray(context, "context");
            ShortTextInputFieldView r6 = new ShortTextInputFieldView(context, null, 0, 6, null);
            boolean $z0 = isFieldRequired();
            r6.setRequired($z0);
            String $r3 = getFieldLabel();
            r6.setLabel($r3);
            String $r32 = getFieldLabel();
            r6.setInputHint($r32);
            r6.setInputType(0);
            C13666w c13666w = C13666w.f30112a;
            this.formField = r6;
            if (r6 != null) {
                return r6;
            }
            String $r33 = "Required value was null.".toString();
            IllegalArgumentException r7 = new IllegalArgumentException($r33);
            throw r7;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("ShortText(isFieldRequired=");
            boolean $z0 = isFieldRequired();
            $r1.append($z0);
            $r1.append(", fieldLabel=");
            String $r2 = getFieldLabel();
            $r1.append($r2);
            $r1.append(", fieldHint=");
            String $r22 = getFieldHint();
            $r1.append($r22);
            $r1.append(')');
            String $r23 = $r1.toString();
            return $r23;
        }
    }

    private ProductFormFieldTypeUiModel(boolean z, String str, String str2) {
        this.isFieldRequired = z;
        this.fieldLabel = str;
        this.fieldHint = str2;
    }

    public /* synthetic */ ProductFormFieldTypeUiModel(boolean z, String str, String str2, DBUtils$1 dBUtils$1) {
        this(z, str, str2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getFieldHint() {
        String r1 = this.fieldHint;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getFieldLabel() {
        String r1 = this.fieldLabel;
        return r1;
    }

    public abstract String getInputValue();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isFieldRequired() {
        boolean z0 = this.isFieldRequired;
        return z0;
    }

    public abstract boolean isValid();

    public abstract View makeFormField(Context context);
}
