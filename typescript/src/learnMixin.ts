// ref: https://www.codewars.com/kata/597277844998c50c9a000051/train/typescript

export class Serializable {
    stringfiyValue = (value: any): string => {
        const t = typeof value;
        if (t !== 'object' || t === null) {
            return `"${String(value)}"`;
        } else {
            // todo 深度序列化
            return '';
        }
    };

    stringfiy = (pre: string, [key, value]: [string, string], index: number): string => {
        const itemStr = `"${key}": ${this.stringfiyValue(value)}`;
        pre += itemStr;
        index === Object.keys(this).length - 1 && (pre += '}');
        return pre;
    };

    serialize(): string {
        return Object.entries(this).reduce(this.stringfiy, '{');
    }

    deserialize(source: string): void {
        // TODO:
    }
}
