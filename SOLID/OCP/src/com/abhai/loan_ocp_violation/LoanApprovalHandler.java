package com.abhai.loan_ocp_violation;

public class LoanApprovalHandler {
    public void approvePersonalLoan (PersonalLoanValidator validator) {
        if ( validator.isValid()) {
            //Process the loan.
        }
    }

    public void approveVehicleLoan (VehicleLoanValidator validator ) {
        if ( validator.isValid()) {
            //Process the loan.
        }
    }
    // Method for approving other loans.
}


class PersonalLoanValidator {
    public boolean isValid() {
        //Validation logic
        return true;
    }
}


class VehicleLoanValidator {
    public boolean isValid() {
        //Validation logic
        return true;
    }
}