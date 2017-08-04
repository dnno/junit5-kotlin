package de.rpr.junit5kotlin

import org.junit.jupiter.api.extension.ConditionEvaluationResult
import org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled
import org.junit.jupiter.api.extension.ExecutionCondition
import org.junit.jupiter.api.extension.ExtensionContext

class ExternalSystemCondition : ExecutionCondition {

    override fun evaluateExecutionCondition(context: ExtensionContext?): ConditionEvaluationResult {
        return enabled("Because why not!?")
    }
}