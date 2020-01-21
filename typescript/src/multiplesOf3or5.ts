// ref: https://www.codewars.com/kata/514b92a657cdc65150000006/solutions/typescript

const sum = (a: number[]) => a.reduce((a, b) => a + b, 0);

export class Challenge {
    static solution(number: number): number {
        return sum(
            Array.from({ length: number }, (_, i) => i).filter(i => i % 3 === 0 || i % 5 === 0)
        );
    }
}
