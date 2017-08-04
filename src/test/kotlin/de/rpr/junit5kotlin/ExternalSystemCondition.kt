package de.rpr.junit5kotlin

import org.junit.jupiter.api.extension.ConditionEvaluationResult
import org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled
import org.junit.jupiter.api.extension.TestExecutionCondition
import org.junit.jupiter.api.extension.TestExtensionContext

class ExternalSystemCondition : TestExecutionCondition {
    override fun evaluate(context: TestExtensionContext?): ConditionEvaluationResult {
        return enabled("t")
    }
}