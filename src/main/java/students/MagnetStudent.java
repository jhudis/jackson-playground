package students;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.jetbrains.annotations.NotNull;

/**
 * A student in the Magnet program.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class MagnetStudent extends Student {

	/**
	 * This student's SAT score.
	 */
	private final int satScore;


	/**
	 * Default constructor.
	 *
	 * @param grade The grade level this student is in.
	 * @param name  This student's name.
	 * @param satScore    This student's SAT score.
	 */
	@JsonCreator
	public MagnetStudent(@JsonProperty(required = false) int grade,
	                     @NotNull @JsonProperty(required = false) String name,
	                     @JsonProperty(required = false) int satScore) {
		super(grade, name, 4.0);
		this.satScore = satScore;
	}

	/**
	 * @return This student's SAT score.
	 */
	public int getSatScore() {
		return satScore;
	}

	/**
	 * @return A string representation of this student's grade, name, GPA, and SAT score.
	 */
	@Override
	public String toString() {
		return "students.MagnetStudent{" +
				"grade=" + getGrade() +
				", name=" + getName() +
				", gpa=" + getGpa() +
				", satScore=" + getSatScore() +
				"}";
	}
}
